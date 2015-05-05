package com.dancs.eclipselink.service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import com.dancs.eclipselink.entity.Books;

public class UpdateBook {

	public static void main(String[] args) {
		EntityManagerFactory emfactory = Persistence
				.createEntityManagerFactory("JPABooks");
		EntityManager entitymanager = emfactory.createEntityManager( );
		entitymanager.getTransaction( ).begin( );
		
		Books books = entitymanager.find(Books.class, "A1001");
		System.out.println(books);
		books.setRating(5);
		entitymanager.getTransaction().commit();
		
		System.out.println(books);
		entitymanager.clear();
		emfactory.close();
		
	}

}
