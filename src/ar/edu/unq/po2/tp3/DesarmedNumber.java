package ar.edu.unq.po2.tp3;

import java.util.ArrayList;

public class DesarmedNumber {

	private ArrayList<Integer> numbers = new ArrayList<Integer>();
	
	public DesarmedNumber() {
		super();
	}
	
	//getters and setters
	
	public ArrayList<Integer> getNumbers(){
		return this.numbers;
	}
	
	public void addNumberToList(int n) {
		this.getNumbers().add(n);
	}
	
	// public methods
	
	public int mostEvenDigitsNumber(ArrayList<Integer> list) {
		int mostEvens = 0;
		int actualMaxOfEvens = 0;
		for(int n : list) {
			/*
			 * agarro n y le cuento la cantidad de evens
			 * lo comparon con amountOfEvens
			 * si es mayor, actualizo los dos valores
			 * */
			if(this.amountOfEvensOf(n)>actualMaxOfEvens) {
				actualMaxOfEvens = this.amountOfEvensOf(n);
				mostEvens = n;
			}
		}
		return mostEvens;
	}

	private int amountOfEvensOf(int n) {
		int evens = 0;
		int remainingN = n;
		while(remainingN > 0) {
			if((remainingN%10) % 2 == 0) {
				evens++;
			}
			remainingN = remainingN / 10;
		}
		return evens;
	}
}
