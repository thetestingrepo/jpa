package com.dancs.eclipselink.service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import com.dancs.eclipselink.entity.Books;

public class FindBook {

	public static void main(String[] args) {
		EntityManagerFactory emfactory = Persistence
				.createEntityManagerFactory("JPABooks");
		EntityManager entitymanager = emfactory.createEntityManager( );
		Books books = entitymanager.find(Books.class, "A1001");

		 System.out.println("Book Id: "+books.getBook_id());
		 System.out.println("Book Title: "+books.getTitle());
		 System.out.println("Book Author: "+books.getAuthor_first_name()+
				 " "+books.getAuthor_last_name());
		 System.out.println("Book Rating: "+books.getRating());
	}

}
