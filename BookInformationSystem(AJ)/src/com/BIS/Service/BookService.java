package com.BIS.Service;

import com.BIS.Dao.BookDao;
import com.BIS.Entity.BookEntity;

public class BookService {
	public BookEntity getBook(){
		BookDao Dao=new BookDao();
		BookEntity b=Dao.getBook();
		 return b;
	}
}
