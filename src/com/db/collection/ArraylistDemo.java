package com.db.collection;

import java.util.ArrayList;
import java.util.List;

public class ArraylistDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// define the array List here 
		
		// List is a interface and ArrayList is a class which contains the duplicate elements and allocation is always in sequential manner.
		   List al = new ArrayList();
		   
		   
		// First print the Size of List 
		   
		   // before adding 
		   System.out.println("Initial size of al: " + al.size());
	
	        al.add("mumbai");
	        al.add("MALE");
	        al.add("NEW YORK");
	        al.add("COLOMBO");
	        al.add("Pune");
	        al.add("Pune");
	        
	        
	        // After adding the element
	        System.out.println("After Adding  size of al: " + al.size());
	}

}
