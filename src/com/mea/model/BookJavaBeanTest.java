package com.mea.model;

import java.io.Serializable;

public class BookJavaBeanTest implements Serializable {
/**
	 * 
	 */
private static final long serialVersionUID = 1L;
private int id=0;
private String name=null;
private String price=null;
private String publication=null;
private String author=null;

//Default Constructor
public BookJavaBeanTest(){
//empty	
}


public int getId() {
	return id;
}


public void setId(int id) {
	this.id = id;
}


public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getPrice() {
	return price;
}

public void setPrice(String price) {
	this.price = price;
}

public String getPublication() {
	return publication;
}

public void setPublication(String publication) {
	this.publication = publication;
}

public String getAuthor() {
	return author;
}

public void setAuthor(String author) {
	this.author = author;
}

}
