package it.ilsolitopincopallino.InputVacanze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ProveInput {
	
	private static void primoModo() throws IOException{
		// PRIMO MODO con java.io.ImputStreamReader e classe di supporto per
				// Bufferizzare
				// Java.io.BufferedReader
				System.out.println("Inserisci una parola: ");
				InputStreamReader tastiera = new InputStreamReader(System.in);

				int carattereLetto = -1;
				try {
					carattereLetto = tastiera.read();

				}

				catch (IOException e) {
					e.printStackTrace();

				}
				System.out.println("il primo carattere letto e':" + (char) carattereLetto);
				// Notare che per usare tastiera.read() qui sotto ho dovuto rilanciare
				// l'eccezione con trows IOException su main, cioe' alla VM
				System.out.println("il secondo carattere letto e'" + (char) tastiera.read());

				// Ora Buffer
				BufferedReader buffertastiera = new BufferedReader(new InputStreamReader(System.in));
				System.out.println("-------------------\nRiscrivi un po' una frase: ");
				// anche ora qui sotto buffertastiera.readline(9 rilancia una eccezzione
				// IOException ma
				// visto che io l'ho gia rilanciata niente da gestire
				String rigaLetta = buffertastiera.readLine();
				System.out.println("Hai scritto: " + rigaLetta);

				System.out.println("--------------------\n Ora dammi un numero: ");
				Double num = Double.parseDouble(buffertastiera.readLine());
				System.out.println("Hai scritto il double: " + num);
	}
	
	private static void secondoModo(){
		// SECONDO MODO con java.util.Scanner senza eccezioni checked;
				System.out.println("dammi un il numero di persone che verranno alla festa e il tuo nome: ");
				Scanner sc = new Scanner(System.in);
				System.out.println("hai inserito " + sc.next() + " seguito da " + sc.next());
				
				//ora prendiamo un tipo specifico in ingresso, non una stringa
				//LA Libreria Scanner ha tutta una serie di metodi per il parsing automatico
				//ma facciamo in modo che anche se non c'e' il tipo voluto li per primo scarto tutti fino a che.. 
				System.out.print("Dammi il tuo peso:");
				while (!sc.hasNextDouble()){//nota che tutti i metodi hasNext non eliminanot il prox
					sc.next();
					}
				System.out.println("belin pesi "+sc.nextDouble()+" Kg");
	}
			private static void numeroTel(){
				Scanner sc=new Scanner(System.in);
				System.out.print("dammi un numero di telefono: ");
			while(!sc.hasNext("[0-9]{3,4}\\-[0-9]{6,7}")){
				System.out.println("formato errato, riprova");
				sc.next();//elimina il valore che hai messo e cosi puoi riprovare.
			}
				System.out.println("il numero inserito e': " +sc.next() );
				String ancora=sc.next();
				System.out.println(ancora);
			}
	

	public static void main(String[] args)  {
		//ProveInput.primoModo();
		//ProveInput.secondoModo();
		numeroTel();
		
	}

}
