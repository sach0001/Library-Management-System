package com.entity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name="Book_Table")
public class Book {
	
		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		private int Bid;
		@Column(name="Book_Title",nullable=false)
		private String title;
		@Column(name="Book_Author")
		private String author;
		@Column(name="Book_Price")
		private double price;
		public int getBid() {
			return Bid;
		}
		public void setBid(int bid) {
			Bid = bid;
		}
		public String getTitle() {
			return title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		public String getAuthor() {
			return author;
		}
		public void setAuthor(String author) {
			this.author = author;
		}
		public double getPrice() {
			return price;
		}
		public void setPrice(double price) {
			this.price = price;
		}
		
         public Book(String title, String author, double price) {
			super();
			this.title = title;
			this.author = author;
			this.price = price;
		}
		public Book(int bid, String title, String author, double price) {
			super();
			Bid = bid;
			this.title = title;
			this.author = author;
			this.price = price;
		}
		@Override
		public String toString() {
			return "Book [Bid=" + Bid + ", title=" + title + ", author=" + author + ", price=" + price + "]";
		}
		public Book() {
			super();
			// TODO Auto-generated constructor stub
		}
		
		

	}