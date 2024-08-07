package com.Servlet;

import java.io.IOException;

import com.dao.BookDao;
import com.entity.Book;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AddBookServelete
 */
public class addBookServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private BookDao bookDao = new BookDao();
    /**
     * Default constructor. 
     */
    public addBookServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		 String title = request.getParameter("title");
	        String author = request.getParameter("author");
	        String priceStr = request.getParameter("price");
	        double price = Double.parseDouble(priceStr.trim());
//	        if (title != null) title = title.trim();
//	        if (author != null) author = author.trim();
//
//	        double price = 0.0;
//	        if (priceStr != null) {
//	            try {
//	                price = Double.parseDouble(priceStr.trim());
//	            } catch (NumberFormatException e) {
//	                System.out.println("Invalid price format");
//	                response.sendRedirect("addBook.jsp");
//	                return;
//	            }
//	        }

	        System.out.println(price+" "+author+" "+title);
	        Book b1 = new Book(title, author, price);

	        boolean result = bookDao.save(b1);
	        if (!result) {
	            System.out.println("Book Added Successfully");
	            response.sendRedirect("BookListServelet");
	        } else {
	            System.out.println("Something went wrong");
	            response.sendRedirect("addbook.jsp");
	        }
		
	}

}
