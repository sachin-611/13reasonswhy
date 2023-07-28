/**
 * 
 */
package com.db.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 
 */
public class ArraylistDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// define the array List here 
		
		// List is a interface and ArrayList is a class which contains the duplicate elements and allocation is always in sequential manner.
		List<String> al = new ArrayList<String>();
		   
		   //The definition of the collection is it can hold multiple objects
		   //We can make collection type safe using generic concept which is represented by symbol <> 
		   
		   // create
		// First print the Size of List 
		   
		   // before adding 
		   System.out.println("Initial size of al: " + al.size());
	
	        al.add("mumbai");
	        al.add("MALE");
	        al.add("NEW YORK");
	        al.add("COLOMBO");
	        al.add("Pune");
	        al.add("Pune");
	        al.add("Newyork");
	        
	        //remove
	        //We can remove the collection 
        	// remove the collection here 
	        
	        System.out.println("After Adding  size of al: " + al.size());
	        
	        al.remove("COLOMBO");
	        //  al.remove(2);
	       
	        
	        
	        // After adding the element
	        System.out.println("After Adding  size of al: " + al.size());
	        
	        //List collection
	        /*
	         * 1 We can iterate the collection using 2 ways
	         *  	1 using iterable interface
	         *  	2 using the for loop in shorten way style
	         */
	        
	        
	        
	        // Iterable interface 
	          
	          // Iterator is interface which is using to iterate the Collection
	          Iterator<String> i=al.iterator();
	          while(i.hasNext()){
	        	  
	        	  String test=i.next();
	        	  System.out.println("detals of Capital------>" +test);
	          }
		
	          
	    
	          // Another way to iterate the collection using for loop 
	          
	       // Loop through elements.
	             for (String value : al) {
	         	    
	         	    System.out.println("Element: " + value);
	         	}
	        

	}

}