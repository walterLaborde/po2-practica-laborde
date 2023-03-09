package ar.edu.unq.po2.tp3;

import java.util.ArrayList;

public class Counter {

	private ArrayList<Integer> numbers = new ArrayList<Integer>();
	private int amount = 0;
	
	// constructor sin campos... lo doy de alta vacio
	public Counter() {
		super();
	}
	
	//getters and setters

	public ArrayList<Integer> getNumbers() {
		return this.numbers;
	}
	
	public int getAmount() {
		return amount;
	}

	//public methods
	
	public void addNumberToList(int n) {
		this.getNumbers().add(n);
	}

	public int evenOcurrences(ArrayList<Integer> list) {
		for(int n : numbers) {
			if (n%2 == 0) {
				amount++;
			}
		}
		return amount;
	}
	
	public int unevenOcurrences(ArrayList<Integer> list) {
		for(int n : numbers) {
			if (n%2 != 0) {
				amount++;
			}
		}
		return amount;
	}
	
	public int multipleOfOcurrences(ArrayList<Integer> list, int m) {
		for(int n : numbers) {
			if (n%m == 0) {
				amount++;
			}
		}
		return amount;
	}
	
}
