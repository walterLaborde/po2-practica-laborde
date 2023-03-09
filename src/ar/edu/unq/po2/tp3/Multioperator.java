package ar.edu.unq.po2.tp3;

import java.util.ArrayList;

public class Multioperator {

	private ArrayList<Integer> enteros = new ArrayList<Integer>();
	
	public Multioperator() {
		super();
	}
	
	public ArrayList<Integer> getEnteros() {
		return this.enteros;
	}
	
	public void addEnteroToList(int n) {
		this.getEnteros().add(n);
	}
	
	public int sumEnteros(ArrayList<Integer> list) {
		return this.getEnteros()
				   .stream()
				   .reduce(0, (num1, num2) -> num1 + num2);
	}
	
	public int subtractEnteros(ArrayList<Integer> list) {
		return this.getEnteros()
				   .stream()
				   .reduce(0,(num1, num2) -> (-num1) + (-num2));
	}
	
	public int multiplyEnteros(ArrayList<Integer> list) {
		return this.getEnteros()
				   .stream()
				   .reduce(1, (num1, num2) -> num1 * num2);
	}
}
