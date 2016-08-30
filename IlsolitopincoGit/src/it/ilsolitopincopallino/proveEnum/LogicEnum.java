package it.ilsolitopincopallino.proveEnum;
import  it.ilsolitopincopallino.proveEnum.PincopallinoEnum;

public class LogicEnum {

	public static void main(String[] args) {
		System.out.println(new String("vaffanculo"));
		System.out.println(PincopallinoEnum.class);
		System.out.println(PincopallinoEnum.values());
		for(PincopallinoEnum p:PincopallinoEnum.values())
		System.out.println(p+" "+p.ordinal()+" ..che pesa "+p.getPeso());

	}

}
