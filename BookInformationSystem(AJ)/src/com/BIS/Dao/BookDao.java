package com.BIS.Dao;

import com.BIS.Entity.BookEntity;

public class BookDao {
	public BookEntity getBook(){
		 BookEntity book=new BookEntity(1,"Shyamachi Aai","Sane Guruji");
		 return book;
	}
}
