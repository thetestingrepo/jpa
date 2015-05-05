package com.dancs.eclipselink.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.dancs.eclipselink.entity.Books;

public class NamedQueries {

	public static void main(String[] args) {
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "JPABooks" );
		EntityManager entitymanager = emfactory.createEntityManager();
		 Query query = entitymanager.createNamedQuery("find book by id");
		 query.setParameter("id", "A2222");
		 
		 List<Books> books = query.getResultList( );
		 for (Books book : books) {
			 System.out.println(books);
		}

	}

}
