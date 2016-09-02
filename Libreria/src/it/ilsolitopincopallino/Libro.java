package it.ilsolitopincopallino;

public class Libro {
	private String titolo;
	private String autore;
	private String categoria;
	
	public Libro(String titolo, String autore, String categoria) {
		super();
		this.titolo = titolo;
		this.autore = autore;
		this.categoria = categoria;
	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public String getAutore() {
		return autore;
	}

	public void setAutore(String autore) {
		this.autore = autore;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	
	

}
