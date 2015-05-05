package com.dancs.eclipselink.service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import com.dancs.eclipselink.entity.Books;

public class DeleteBook {

	public static void main(String[] args) {
		EntityManagerFactory emfactory = Persistence
				.createEntityManagerFactory("JPABooks");
		EntityManager entitymanager = emfactory.createEntityManager( );
		entitymanager.getTransaction( ).begin( );
		
		Books books = entitymanager.find(Books.class, "A1001");
		entitymanager.remove(books);
		entitymanager.getTransaction().commit();
		entitymanager.close();
		emfactory.close();
		
	}

}
