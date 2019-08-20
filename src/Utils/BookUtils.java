package Utils;

import entity.Book;

public class BookUtils {
	public static void printBooks(Book[] books) {
		System.out.println("/***************KÝTAPLAR LÝSTELENÝYOR******************/");
		for(Book kitap : books) {
			System.out.print("Kitabýn yazarý:"+kitap.getAuthor());
			System.out.print(" -Kitabýn dili:"+kitap.getLanguage());
			System.out.print(" -Kitap sayfa sayýsý:"+kitap.getPageCount());
			System.out.println(" -Kitabýn bulunduðu yer:"+kitap.getLocation());
		}
		System.out.println("/***************KÝTAPLAR LÝSTELENDÝ******************/");
	}
}
