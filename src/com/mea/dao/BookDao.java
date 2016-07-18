package com.mea.dao;

import java.util.List;

import com.mea.model.BookJavaBeanTest;

public interface BookDao {

	boolean verifyBook(BookJavaBeanTest bookbean);

	List<BookJavaBeanTest> getBookDao();

}
