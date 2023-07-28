/**
 * 
 */
package com.db.io;

import java.util.Scanner;

import com.db.bean.Customer;

/**
 * 
 */
public class TestScanner {

	/**
	 * @param args
	 */
	public static Customer getData() {
		Customer temp=new Customer();
		System.out.println("--------Enter Your Details-------- ");  
        Scanner in = new Scanner(System.in);  
        System.out.print("Enter your name: ");    
        temp.setCustomerName(in.next());   
        System.out.println("Name: " + temp.getCustomerName());           

        System.out.print("Enter your Address: ");
        temp.setCustomerAddress(in.next());   
 
        System.out.println("Address: " + temp.getCustomerAddress());         
        in.close();  
        return temp;
	}   
	
}
