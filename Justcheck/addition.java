package Justcheck;

import AccessModifier.Protected;

public class addition extends Protected {

	public static void main(String[] args) {
		addition adding = new addition();
		
		System.out.println("Addition of two numbers--->"+adding.add(10, 20));
//Access Specifier	class	package	subclass	others	
//1. Default		yes		yes		yes			yes
//2. Public			yes		yes		yes			no
//3. Private		yes		yes		yes			no
//4. Protected		yes		no		no			no
	}

}
