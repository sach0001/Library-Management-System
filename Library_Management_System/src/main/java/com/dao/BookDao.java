package com.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.configuration.HibernateConfiguration;
import com.entity.Book;

public class BookDao {
   public static boolean save(Book book) {
	   Transaction trans= null;
	   Session session =HibernateConfiguration.getSessionFactory().openSession();
	   trans=session.beginTransaction();
	   session.save(book);
	   trans.commit();
	   session.close();
	   return false;
   }
   
   public static List<Book> getBooks() {
	   //Transaction trans= null;
	   Session session =HibernateConfiguration.getSessionFactory().openSession();
//	   trans=session.beginTransaction();
	   return session.createQuery("from Book",Book.class).list();
   }
   
   public static boolean Update(Book book) {
	   boolean result=false;
	   Transaction trans= null;
	   Session session =HibernateConfiguration.getSessionFactory().openSession();
	   trans=session.beginTransaction();
	   
	   Book books = session.get(Book.class,book.getBid());
	   if(books!=null) {
		   books.setTitle(book.getTitle());
		   books.setAuthor(book.getAuthor());
		   books.setPrice(book.getPrice());
		   session.update(books);
		   trans.commit();
		   session.close();	
		   result= true;
	   }
	   return result;
   }
   
   public static boolean delete(int id) {
	   boolean result=false;
	   Transaction trans= null;
	   Session session =HibernateConfiguration.getSessionFactory().openSession();
	   trans=session.beginTransaction();
	   
	   Book books = session.get(Book.class,id);
	   if(books!=null) {
		   session.delete(books);
		   trans.commit();
		   session.close();	
		   result= true;
		   
	   }
	   return result;
   }
}
