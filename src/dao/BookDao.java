package dao;

import entity.Book;
import entity.Language;

public class BookDao {

	public Book[] initBooks() {
		int bookCount = 100;
		Book[] books = new Book[bookCount];
		
		for(int i = 0;i<bookCount;i++) {
			Book kitap = new Book();
			kitap.setAuthor("yazar " + i);
			if(i%9==0) {
				kitap.setLanguage(Language.ENGLISH);				
			}else if(i%7==0) {
				kitap.setLanguage(Language.FRENCH);
			}else if(i%3==0) {
				kitap.setLanguage(Language.GERMAN);
			}else {
				kitap.setLanguage(Language.TURKISH);
			}

			kitap.setLocation("A2-3" + i);
			kitap.setPageCount(100 + i);
			kitap.setYear(2010);
			books[i] = kitap;
		}
		return books;
	}
	
	public Book[] generateBooksWithPageCount1000() {
		int bookCount = 300;
		Book[] books = new Book[bookCount];
		
		for(int i = 0;i<bookCount;i++) {
			Book kitap = new Book();
			kitap.setAuthor("yazar " + i);
			if(i%9==0) {
				kitap.setLanguage(Language.ENGLISH);				
			}else if(i%7==0) {
				kitap.setLanguage(Language.FRENCH);
			}else if(i%3==0) {
				kitap.setLanguage(Language.GERMAN);
			}else {
				kitap.setLanguage(Language.TURKISH);
			}

			kitap.setLocation("A2-3" + i);
			kitap.setPageCount(1000);
			kitap.setYear(2010);
			books[i] = kitap;
		}
		return books;
	}
	
}
