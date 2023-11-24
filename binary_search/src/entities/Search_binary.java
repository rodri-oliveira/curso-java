package entities;

public class Search_binary {
	
	public int [] array;
	
	public Search_binary(int[] array) {
		this.array = array;
	}
	
	public int searchBinary(int key) {
		int start = 0;
		int end = array.length -1;
		
		while(start <= end) {
			int meio = start + (end - start) / 2;
			
			if(array[meio] == key) {
				return meio;
			}
			
			if(array[meio] > key) {
				end = meio -1;
			}else {
				start = meio +1;
			}
		}
		
		return -1;
	}

}
