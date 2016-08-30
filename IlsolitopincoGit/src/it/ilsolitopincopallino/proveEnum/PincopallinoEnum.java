package it.ilsolitopincopallino.proveEnum;

public enum PincopallinoEnum {
	MIRKO,
	TAPPETINO_PIETRO,
	CIPPALIPPA,
	PINCOPALLINO(55.357);
	
	private final double peso;
	//Anche gli enum hanno costruttore, questo privato permette ovviamente di costruire solo i public static qui sopra
	private PincopallinoEnum() {
	System.out.print("abbiamo costruito ");
	this.peso=90.52D;
	}
	
	private PincopallinoEnum(double peso){
		this.peso=peso;
	}
	public double getPeso() {
		return peso;
	}
	
	
	

}
