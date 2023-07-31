package com.db.exception;

public class DemoException {
	
	public static void main(String []args) {
		try {
			int a=10, b=0,c;
			c=a/b;
			System.out.println("Output os c ="+c);
		}catch(Exception ex) {
			System.out.println("Invalud math expression is ->"+ex.getMessage());
			
		}finally {
			System.out.println("Program has ended");
			
		}
	}
}
