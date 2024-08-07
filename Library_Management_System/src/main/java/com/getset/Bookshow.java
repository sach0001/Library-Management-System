package com.getset;

import java.util.List;

import com.entity.Book;

public class Bookshow {
   private static List<Book> booklistBooks;
   private static int id;

public static int getId() {
	return id;
}

public static void setId(int id) {
	Bookshow.id = id;
}

public static List<Book> getBooklistBooks() {
	return booklistBooks;
}

public static void setBooklistBooks(List<Book> booklistBooks) {
	Bookshow.booklistBooks = booklistBooks;
} 
   
}
