package Utils;

import entity.Book;

public class BookUtils {
	public static void printBooks(Book[] books) {
		System.out.println("/***************K�TAPLAR L�STELEN�YOR******************/");
		for(Book kitap : books) {
			System.out.print("Kitab�n yazar�:"+kitap.getAuthor());
			System.out.print(" -Kitab�n dili:"+kitap.getLanguage());
			System.out.print(" -Kitap sayfa say�s�:"+kitap.getPageCount());
			System.out.println(" -Kitab�n bulundu�u yer:"+kitap.getLocation());
		}
		System.out.println("/***************K�TAPLAR L�STELEND�******************/");
	}
}
