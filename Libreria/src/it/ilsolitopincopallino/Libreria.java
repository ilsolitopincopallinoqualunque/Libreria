package it.ilsolitopincopallino;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Libreria {
	List<Libro> catalogo=new LinkedList<>();

	public Libreria() {
		super();
	}

	public Libreria(List<Libro> catalogo) {
		super();
		this.catalogo = catalogo;
	}

	
	public Libreria(Libro... catalogo){
		this.catalogo=new LinkedList<>(Arrays.asList(catalogo));
	}

//	public Libreria(Libro[] catalogo){
//		this.catalogo=new LinkedList<>(Arrays.asList(catalogo));
//	}
	
	public List<Libro> getCatalogo() {
		return catalogo;
	}

	public void setCatalogo(List<Libro> catalogo) {
		this.catalogo = catalogo;
	}
	public void aggiungiLibro(Libro libro){
		catalogo.add(libro);
		
	
	}
	

	public void stampaCatalogo(List<Libro> lib){
		System.out.printf("   %-30s  |  %-30s |  %-30s | %n" ,"TITOLO","AUTORE","CATEGORIA" );
		System.out.printf("   %-30s  |  %-30s |  %-30s | %n" ,"---------------------------","--------------------------","--------------------------" );
	for(Libro l:lib){
		
	System.out.printf("   %-30s  |  %-30s |  %-30s | %n" ,l.getTitolo(),l.getAutore(),l.getCategoria() );
	}
	}
	
	public List<Libro> getLibriFiltrati(FiltraLibri filtrolibro){
		List<Libro> librifiltrati= new LinkedList<>();
		for(Libro l:catalogo){
			if(filtrolibro.filtra(l)){
				librifiltrati.add(l);
			}
			
			
		}
		return librifiltrati;
	}

}
