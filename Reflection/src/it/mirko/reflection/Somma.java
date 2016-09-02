package it.mirko.reflection;

public class Somma implements Operation {

	@Override
	public void opChoise() {
		System.out.println("Somma");

	}

	@Override
	public int execute(int a, int b) {
		return a+b;

	}

}
