package com.db.service;

// we call the math class method directly by the class name because the math class contain all respective static method
// and static method directly calls by the class name not from the instance

public class SciCal {

	public static double squareRoot(double num) {
        return Math.sqrt(num);
    }

    public static double sine(double num) {
        return Math.sin(num);
    }

    public static double cosine(double num) {
        return Math.cos(num);
    }
    
    public static double tangent(double num) {
        return Math.tan(num);
    }

    public static double logarithm(double num) {
        return Math.log(num);
    }


}
