package apps;

import examples.Calculator;
import examples.CalculatorSub;
import examples.CalculatorMul;
import examples.CalculatorDiv;


public class CalculatorApp{
	public static void main(String [] args){
		Calculator aCalculator = new Calculator();
		int sumReturned = aCalculator.add(5,3);
		System.out.println("The sum is: "+sumReturned);

		CalculatorSub bCalculator = new CalculatorSub();
		int subReturned = bCalculator.sub(6,2);
		System.out.println("The sub is: "+subReturned);

		CalculatorMul cCalculator = new CalculatorMul();
		int mulReturned = cCalculator.mul(10,3);
		System.out.println("The mul is: "+mulReturned);

		CalculatorDiv dCalculator = new CalculatorDiv();
		int divReturned = dCalculator.div(6,3);
		System.out.println("The div is: "+divReturned);



	}
}