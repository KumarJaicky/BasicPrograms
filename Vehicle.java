
public abstract class Vehicle {
	
	private int tyres;
	
	public Vehicle(int tyres){
		this.tyres=tyres;
	}
	
	

	abstract int mileage();
	
	public abstract int noOfTyres();
	
	public int noOfDoors(){
		return 3;
	}
	
public static void main(String args[]){
	Vehicle vehicle = new Vehicle(1) {
		
		
	}
