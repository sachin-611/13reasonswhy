/**
 * 
 */
package com.db.exception;

/**
 *  We can create any custom exception class extending the Exception
 */
public class InsufficientFundsException extends Exception {

	private double amount;
	   public InsufficientFundsException(double amount)
	   {
	      this.amount = amount;
	   } 
	   public double getAmount() {
		   return amount;
	   }
}