package examples;

public class Car{

	int noOfWheels=4;
	String color;
	int noOfDoors;
	boolean carStarted=false;

	public void startCar(){
		carStarted=true;
	}
	public void stopCar(){
		carStarted=false;
	}	
	public void setColor(String newColor){
		color = newColor;
	}
	public void setNoOfDoors(int newDoors){
		noOfDoors = newDoors;
	}
	public String getColor(){
		return color;
	}
	public int getNoOfDoors(){
		return noOfDoors;
	}
	public int getNoOfWheels(){
		return noOfWheels;
	}
	public boolean getCarStarted(){
		return carStarted;
	}	
}