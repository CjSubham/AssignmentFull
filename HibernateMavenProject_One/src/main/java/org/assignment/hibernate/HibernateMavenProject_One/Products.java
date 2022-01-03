package org.assignment.hibernate.HibernateMavenProject_One;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="Shopping")
public class Products {
@Id
private int product_id;
private String name;
private int price;
public Products(int product_id, String name, int price) {
	super();
	this.product_id = product_id;
	this.name = name;
	this.price = price;
}
public Products() {
	super();

}
public int getProduct_id() {
	return product_id;
}
public void setProduct_id(int product_id) {
	this.product_id = product_id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
@Override
public String toString() {
	return "Products [product_id=" + product_id + ", name=" + name + ", price=" + price + "]";
}

}
