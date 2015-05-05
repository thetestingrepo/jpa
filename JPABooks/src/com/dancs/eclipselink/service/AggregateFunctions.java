package com.dancs.eclipselink.service;

import java.sql.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.dancs.eclipselink.entity.Books;

public class AggregateFunctions {

	public static void main(String[] args) {
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "JPABooks" );
		EntityManager entitymanager = emfactory.createEntityManager();
		
		Query query = entitymanager.
			      createQuery("Select UPPER(b.title) from Books b");
		List<String> list = query.getResultList();
		
		 for(String b:list) {
	         System.out.println("Book title :"+b);
	      }
		 Query query1 = entitymanager.createQuery("Select MAX(t.transaction_date) from Transactions t");
		 Date latestBorrowing = (Date) query1.getSingleResult();
	     System.out.println("Latest borrowing:" + latestBorrowing);
	     
		Query query2 = entitymanager.createQuery("Select b "
				+ "from Books b " + "where b.title like 'M%'");
		List booksWithM = query2.getResultList();
		System.out.println("Books starts with 'M': ");
		for (Object object : booksWithM) {
			Books b = (Books)object;
		}
		
		
	}

}
