package com.saraya.books;

public class BookInfo {
	private String livre;
	private String isbn;
	private String auteur;

	public BookInfo(String livre, String auteur) {
		super();
		this.livre = livre;
		this.auteur = auteur;
	}

	public BookInfo(String livre, String isbn, String auteur) {
		super();
		this.livre = livre;
		this.isbn = isbn;
		this.auteur = auteur;
	}

	public String getLivre() {
		return livre;
	}

	public void setLivre(String livre) {
		this.livre = livre;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getAuteur() {
		return auteur;
	}

	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}
	

}
