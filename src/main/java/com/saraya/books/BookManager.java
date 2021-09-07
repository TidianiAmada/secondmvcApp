package com.saraya.books;


import java.util.ArrayList;

import org.springframework.stereotype.Service;
@Service
public class BookManager {
	public static ArrayList<BookInfo> booklist= new ArrayList<BookInfo>();
	
	static {
		booklist.add(new BookInfo("L'éducation de l'âme", "Imam Ghazali"));
		booklist.add(new BookInfo("Les merveilles du coeur", "Imam Ghazali"));
		booklist.add(new BookInfo("Les sagesses de Ibn AtaaIllah", "Ibn AtaaIllah d'Alexandrie"));
	}
	public ArrayList<BookInfo> getBooklist() {
		return booklist;
	}
	
	public void addtoBooklist(BookInfo newbook) {
		
		booklist.add(newbook);
	}
	public void removefromBooklist(String title) {
			BookInfo book= findByTitle(title);
			booklist.remove(book);
		}
	public void updateList(String titre,String title,String isbn,String auteur) {
		BookInfo bk=findByTitle(titre);
		bk.setLivre(title);
		bk.setAuteur(auteur);
		bk.setIsbn(isbn);
	}
//	public static void main(String[] args) {
////		BookManager bk= new BookManager();
////		bk.getBooklist();
//		for(BookInfo bk: booklist) {
//			System.out.println(bk.getLivre()+bk.getAuteur()+bk.getIsbn());
//		}
//	}
	
	public BookInfo findByTitle(String titre) {
		for(BookInfo bk:booklist) {
			if(bk.getLivre().equalsIgnoreCase(titre)) {
				return bk;
			}
		}
		return null;
	}
}
