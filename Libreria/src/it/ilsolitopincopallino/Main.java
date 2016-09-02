package it.ilsolitopincopallino;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Main {
//forse nome migliore del classico Main sarebbe stato LibreriaService
	
	public static void main(String[] args) {
		
		 
//		Costruttore che accetta LinkedList passandogli un Array
//		Libreria libreria = new Libreria(
//						new LinkedList<>(Arrays.asList(new Libro("Sostiene Pereira", "TAbucchi", "belli"),
//													new Libro("Medicine Eretiche", "qualche pirla", "brutti"),
//													new Libro("Il ritratto di dorain GRay", "Oscar Wilde", "belli"))));

		
//		Costruttore che accettaLinkedList passandogli un array modo2  
//		Libreria libreria=new Libreria(
//							new LinkedList<>(new Libro[]{new Libro("Sostiene Pereira", "TAbucchi" , "belli"),
//		 												new Libro("Medicine Eretiche", "qualche pirla", "brutti"),
//		 												new Libro("Il ritratto di dorain GRay","Oscar Wilde","belli")}));


//		Costruttore con array di Libro (decommentare in Libreria il costruttore)
//		Libreria libreria= new Libreria( new Libro[]{new Libro("Sostiene Pereira", "TAbucchi", "belli"),
//						new Libro("Medicine Eretiche", "qualche pirla", "brutti"),
//						new Libro("Il ritratto di dorain GRay", "Oscar Wilde", "belli")} );

//		Costruttore varargs di Libri (Array di Libri)
		Libreria libreria= new Libreria( new Libro("Sostiene Pereira", "TAbucchi", "belli"),
				new Libro("Medicine Eretiche", "qualche pirla", "brutti"),
				new Libro("Il ritratto di dorain GRay", "Oscar Wilde", "belli") );

		
		
		
		
		
		libreria.stampaCatalogo(libreria.getCatalogo());
		
		
		System.out.println("\n!!!!!!LIBRERIA DI SOLI LIBRI BELLI!!!!!localclassVersion");

//		con classe locale (non interna/nested, local!cioe' definita dentro un pezzo di codice)
		class FiltraBelli implements FiltraLibri{

			@Override
			public boolean filtra(Libro libro) {
				return "belli".equals(libro.getCategoria());
			}
			
		}
		
		FiltraBelli filtrodibelli= new FiltraBelli();
		libreria.stampaCatalogo(libreria.getLibriFiltrati(filtrodibelli));
		
		
		System.out.println("\n!!!!!!LIBRERIA DI SOLI LIBRI BELLI!!!!!!AnonymousClassVersion!!!!!!!!!!!!!");
//		CON FUNZIONE ANONIMA
		libreria.stampaCatalogo(libreria.getLibriFiltrati(new FiltraLibri() {

			@Override
			public boolean filtra(Libro libro) {
				return "belli".equals(libro.getCategoria());
			}
		}));

		System.out.println("\n??????LIBRERIA DI SOLI LIBRI BRUTTI???????????????????");

//		CON FUNZIONE ANONIMA MA SU BRUTTI
//		libreria.stampaCatalogo(libreria.getLibriFiltrati(new FiltraLibri() {
//
//			@Override
//			public boolean filtra(Libro libro) {
//				return "brutti".equals(libro.getCategoria());
//			}
//		}));


//		CON FUNZIONE LAMBA		(SU brutti)
		
		libreria.stampaCatalogo(libreria.getLibriFiltrati( libro->"brutti".equals(libro.getCategoria()) ));
	}

}
