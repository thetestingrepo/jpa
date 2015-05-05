package com.dancs.eclipselink.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import java.sql.Date;

@Entity
@Table
public class Transactions {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO) 	
	
	
	private int transaction_id;
	private int patron_id;
	private String book_id;
	private Date transaction_date;
	private int transaction_type;
	
	public Transactions(int transaction_id, int patron_id, String book_id,
			Date transaction_date, int transaction_type) {
		super();
		this.transaction_id = transaction_id;
		this.patron_id = patron_id;
		this.book_id = book_id;
		this.transaction_date = transaction_date;
		this.transaction_type = transaction_type;
	}

	public Transactions() {
		super();
	}

	public int getTransaction_id() {
		return transaction_id;
	}

	public void setTransaction_id(int transaction_id) {
		this.transaction_id = transaction_id;
	}

	public int getPatron_id() {
		return patron_id;
	}

	public void setPatron_id(int patron_id) {
		this.patron_id = patron_id;
	}

	public String getBook_id() {
		return book_id;
	}

	public void setBook_id(String book_id) {
		this.book_id = book_id;
	}

	public Date getTransaction_date() {
		return transaction_date;
	}

	public void setTransaction_date(Date transaction_date) {
		this.transaction_date = transaction_date;
	}

	public int getTransaction_type() {
		return transaction_type;
	}

	public void setTransaction_type(int transaction_type) {
		this.transaction_type = transaction_type;
	}

	@Override
	public String toString() {
		return "Transactions [transaction_id=" + transaction_id
				+ ", patron_id=" + patron_id + ", book_id=" + book_id
				+ ", transaction_date=" + transaction_date
				+ ", transaction_type=" + transaction_type + "]";
	}
	
	
}
