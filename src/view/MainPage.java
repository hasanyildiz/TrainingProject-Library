package view;

import Utils.BookUtils;
import entity.Book;
import service.BookService;

public class MainPage {

	private BookService bookService;
	
	public MainPage() {
		System.out.println("K�t�phane program� ba�lat�l�yor...");
		System.out.println("Kitaplar y�kleniyor...");
		bookService = new BookService();
		printBooks();
	}
	
	public void printBooks() {
		Book[] books = bookService.generateBooksWithPageCount1000();
		BookUtils.printBooks(books);
	}
}
