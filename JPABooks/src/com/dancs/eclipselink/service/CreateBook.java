package com.dancs.eclipselink.service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import com.dancs.eclipselink.entity.Books;

public class CreateBook {

	public static void main(String[] args) {
		EntityManagerFactory emfactory = Persistence
				.createEntityManagerFactory("JPABooks");
		EntityManager entitymanager = emfactory.createEntityManager( );
		entitymanager.getTransaction( ).begin( );
		
		Books books = new Books();
		books.setBook_id("A1001");
		books.setAuthor_first_name("Gyula");
		books.setAuthor_last_name("Dancs");
		books.setTitle("Bokszolokkal sakkozo");
		books.setRating(4);
		entitymanager.persist(books);
		entitymanager.getTransaction().commit();
		entitymanager.close();
		emfactory.close();
	}

}
