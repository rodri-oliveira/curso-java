package entities;

import java.util.ArrayList;

public class NumerosPrimo {
	
	private ArrayList<Integer> primos;
	
	public NumerosPrimo() {
		this.primos = new ArrayList<>();
	}
	
	public ArrayList<Integer> encontrarPrimo(int n){
		for(int num = 2; num <= n; num++) {
			if(ehPrimo(num)) {
				primos.add(num);
			}
		}
		return primos;
	}
	
	public boolean ehPrimo(int num) {
		for(int div = 2; div < num; div++) {
			if(num % div == 0) {
				return false;
			}
		}
		return true;
	}

}
