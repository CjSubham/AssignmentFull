package org.tutorial_hibernate.HibernateMavenProject;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Tours_Travels")
public class tour {
@Id
 private String name;
 private int age;
 private String destination;
 private int members;
public tour(String name, int age, String destination, int members) {
	super();
	this.name = name;
	this.age = age;
	this.destination = destination;
	this.members = members;
}
public tour() {
	super();
	
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getDestination() {
	return destination;
}
public void setDestination(String destination) {
	this.destination = destination;
}
public int getMembers() {
	return members;
}
public void setMembers(int members) {
	this.members = members;
}
@Override
public String toString() {
	return "tour [name=" + name + ", age=" + age + ", destination=" + destination + ", members=" + members + "]";
}
 
}
