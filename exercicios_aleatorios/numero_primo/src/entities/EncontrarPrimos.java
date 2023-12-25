package entities;

import java.util.ArrayList;

public class EncontrarPrimos {
	
	private ArrayList<Integer> primos;

	public EncontrarPrimos(){
		this.primos = new ArrayList<>();
	}

	public ArrayList<Integer> percorreN(int n){
		for(int num = 3; num <= n; num++){
			if(egPrimo(num)){
				primos.add(num);
			}
		}
		return primos;
	}

	public boolean egPrimo(int num){
		for(int div = 2; div < num; div++){
			if(num % div == 0){
				return false;
			}
		}
		return true;
	}

}
