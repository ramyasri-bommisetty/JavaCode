package examples;

public class Calculator{

// instance variables
	String name = "My Calculator";

	public int add(int firstNumber, int secondNumber){
		// local variables
		int sum = firstNumber + secondNumber;
		System.out.println("This addition is done by Calculator with name: "+name);
		return sum;
	}

	public int subtract(int firstNumber,int secondNumber){
		int sum = firstNumber - secondNumber;
		return sum;
	}

	public int multiply(int firstNumber,int secondNumber){
		int result = firstNumber * secondNumber;
		return result;

	}

	public int divide(int firstNumber,int secondNumber){
		int result = firstNumber/secondNumber;
		return result;
	}
}