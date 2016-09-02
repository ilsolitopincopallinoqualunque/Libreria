package it.mirko.reflection;

public class Moltiplicazione implements Operation {

	@Override
	public void opChoise() {
		System.out.println("Moltipicazione");
	}

	@Override
	public int execute(int a, int b) {
		return a*b;
	}

}
