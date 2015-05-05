package com.dancs.eclipselink.service;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.dancs.eclipselink.entity.Transactions;;


public class FindTransaction {
	public static void main(String[] args) {
		EntityManagerFactory emfactory = Persistence
				.createEntityManagerFactory("JPABooks");
		EntityManager entitymanager = emfactory.createEntityManager( );
		Transactions transaction = entitymanager.find(Transactions.class, 100);
		System.out.println(transaction);
		}
}
