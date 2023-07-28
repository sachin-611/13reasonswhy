/**
 * 
 */
package com.db.demo;
import com.db.service.BasicCal;
import com.db.service.SciCal;
/**
 * 
 */
public class DemoApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("In Java App execution");
	
	BasicCal calculator=new BasicCal();
	System.out.println("addition of number" + calculator.addition(10,10));
	System.out.println("multiplication of number" + calculator.multiply(10,10));
	System.out.println("substraction of number" + calculator.substraction(10,10));
	System.out.println("division of number" + calculator.division(10,10));
	
	SciCal cal=new SciCal();
	System.out.println("squareRoot of number "+ cal.squareRoot(16));
	System.out.println("tangent of number "+ cal.tangent(1));
	System.out.println("cosine of number "+ cal.cosine(16));
	System.out.println("sine of number "+ cal.sine(16));
	System.out.println("logarithm of number "+ cal.logarithm(1e8));
	}
}
