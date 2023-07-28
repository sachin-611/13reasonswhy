package com.db.array;

public class DemoPrimitiveArray {
	public static void main(String args[]){  
//		int a[]={33,3,4,5};//declaration, instantiation and initialization  
//		//printing array  
//		for(int i=0;i<a.length;i++)//length is the property of array  
//			System.out.println(a[i]);  
		//Converting Integer to int    
		Integer a=new Integer(3);    
		int i=a.intValue();//converting Integer to int explicitly  
		int j=a;//unboxing, now compiler will write a.intValue() internally    
		    
		System.out.println(a+" "+i+" "+j); 
	}
}
