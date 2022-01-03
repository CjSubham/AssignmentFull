package org.assignment.hibernatemaven.HibernateMavenProject_Two;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "Stock_Market")
public class Stocks {
@Id
	private String name;
	private double LTP;
	private int quantity;
	private double stoploss;
	public Stocks(String name, double lTP, int quantity, double stoploss) {
		super();
		this.name = name;
		LTP = lTP;
		this.quantity = quantity;
		this.stoploss = stoploss;
	}
	public Stocks() {
		super();
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getLTP() {
		return LTP;
	}
	public void setLTP(double lTP) {
		LTP = lTP;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getStoploss() {
		return stoploss;
	}
	public void setStoploss(double stoploss) {
		this.stoploss = stoploss;
	}
	@Override
	public String toString() {
		return "Stocks [name=" + name + ", LTP=" + LTP + ", quantity=" + quantity + ", stoploss=" + stoploss + "]";
	}
	

}
