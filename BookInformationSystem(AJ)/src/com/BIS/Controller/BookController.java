package com.BIS.Controller;

import com.BIS.Entity.BookEntity;
import com.BIS.Service.BookService;

public class BookController {

	public static void main(String[] args) {
		BookService service=new BookService();
		BookEntity book=service.getBook();
		System.out.println(book);
	}

}
