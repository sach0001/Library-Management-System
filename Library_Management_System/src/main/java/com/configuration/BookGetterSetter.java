package com.configuration;

import java.util.List;

import com.dao.BookDao;
import com.entity.Book;

public class BookGetterSetter {
	private BookDao bookdao =new BookDao();
	
	private static List<Book> booklist;
	
	public static List<Book> getBooklist(){
		return booklist;
		
	}
	public static void setBookList(List<Book> booklist) {
		BookGetterSetter.booklist=booklist;
		
	}
	
	

}
