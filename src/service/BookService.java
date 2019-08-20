package service;

import dao.BookDao;
import entity.Book;

public class BookService {

	private BookDao bookDao;
	
	public BookService() {
		bookDao = new BookDao();
	}
	
	public Book[] getBooks() {
		return bookDao.initBooks();
	}
	
	public Book[] generateBooksWithPageCount1000() {
		return bookDao.generateBooksWithPageCount1000();
	}
}
