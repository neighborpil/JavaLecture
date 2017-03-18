package org.java;

class Person{
	final String nation = "Korea";
	final String ssn;
	String name;
	public Person(String ssn, String name){
		this.ssn = ssn;
		this.name = name;
	}
}
public class PersonExample {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person("123456-1234567","계백");
		System.out.println(p1.nation);
		System.out.println(p1.ssn);
		System.out.println(p1.name);
		
		//p1.nation = "USA";
		//p1.ssn = "135790-1357900";
		//p1.name = "이순신";
	}
}
