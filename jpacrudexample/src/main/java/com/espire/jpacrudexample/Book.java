package com.espire.jpacrudexample;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="book")
@NamedQuery(name="Book.findTitleByIsbn", query="select b.title from Book b where b.isbn=:isbn")
public class Book {

	@Id
	private Integer isbn;
	private String title;
	private String author;
	private Double price;
	
	public Book() {}

	public Book(Integer isbn, String title, String author, Double price) {
		//super();
		this.isbn = isbn;
		this.title = title;
		this.author = author;
		this.price = price;
	}

	public Integer getIsbn() {
		return isbn;
	}

	public void setIsbn(Integer isbn) {
		this.isbn = isbn;
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

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Book [isbn=" + isbn + ", title=" + title + ", author=" + author + ", price=" + price + "]";
	}
	
	
}
