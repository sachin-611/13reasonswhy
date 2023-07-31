package com.db.demo;
import com.db.exception.CustomerNotFound;
import com.db.service.CustomerService;
import java.util.*;

public class CustomerClient {

	public static void main(String[] args) {
		
		CustomerService service = new CustomerService();
		Scanner sc = new Scanner(System.in);
		while(true) {
			
			System.out.println("-------------Menu-------------");
			System.out.println("1) Create Customer");
			System.out.println("2) Update Customer");
			System.out.println("3) Delete Customer");
			System.out.println("4) List Customer");
			System.out.println("5) Exit");
			System.out.println();
			
			int option = sc.nextInt();
	        switch(option) {
	            case 1:
	            	System.out.println("Enter number of customers to be added");
	            	int no = sc.nextInt();
	            	for(int i=0;i<no;i++)
	            	{
	            		System.out.println("Enter your name");
		            	String name = sc.next();
		            	System.out.println("Enter your address");
		            	String address = sc.next();
		            	service.createCustomer(name, address);
	            	}
	                break;
	            case 2:
	            	System.out.println("Enter id");
	            	int id = sc.nextInt();
					try {
						service.updateCustomer(id);
					} catch (CustomerNotFound e) {
						System.out.println("Sorry, but CustomerId " + e.getId() + " is invaild");
						System.out.println();
					}
	                break;
	            case 3:
	            	System.out.println("Enter id");
	            	int idd = sc.nextInt();
	            	System.out.println();
					try {
						service.deleteCustomer(idd);
					} catch (CustomerNotFound e) {
						System.out.println("Sorry, but CustomerId " + e.getId() + " is invaild");
						System.out.println();
					}
	                break;
	            case 4:
	            	service.listCustomer();
	                break;
	             case 5:
	            	return;
	        }
		}
		
	}	

}
