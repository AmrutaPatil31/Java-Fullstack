package com.BIS.Entity;

public class BookEntity {
	private int bookId;
	private String bookName;
	private String author;
	public int getBookId() {
		return bookId;
	}
	
	
	public BookEntity(int bookId, String bookName, String author) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.author = author;
	}


	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	@Override
	public String toString() {
		return "BookEntity [bookId=" + bookId + ", bookName=" + bookName + ", author=" + author + "]";
	}
	
	
}
