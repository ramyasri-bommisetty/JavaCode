package apps;

import examples.Calculator;


public class CalculatorApp{

	public static void main(String [] args){

		Calculator aCalculator = new Calculator();
		int sumReturned = aCalculator.add(5,3);
		System.out.println("The sum is: "+sumReturned);
		System.out.println();

		int subReturned = aCalculator.subtract(6,4);
		System.out.println("the sub is:"+subReturned);
		System.out.println();

		int mulReturned = aCalculator.multiply(5,5);
		System.out.println("the mul is:"+mulReturned);
		System.out.println();

		int divReturned = aCalculator.divide(9,3);
		System.out.println("the div is :"+divReturned);
		System.out.println();
	}
}