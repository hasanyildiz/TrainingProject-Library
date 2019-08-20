package view;

import Utils.BookUtils;
import entity.Book;
import service.BookService;

public class MainPage {

	private BookService bookService;
	
	public MainPage() {
		System.out.println("Kütüphane programý baþlatýlýyor...");
		System.out.println("Kitaplar yükleniyor...");
		bookService = new BookService();
		printBooks();
	}
	
	public void printBooks() {
		Book[] books = bookService.generateBooksWithPageCount1000();
		BookUtils.printBooks(books);
	}
}
