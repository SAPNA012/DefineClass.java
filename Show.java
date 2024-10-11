package basicJava.org.com;

public class Show{//"Vehicles" It is name of class
	
	//Here we will discuss about the class and example of class
	/*Class is blueprint/ prototype of object. Class defines the state and behaviors of  object.
	 * CLASS MEMBER: 1)Field(Variable)  2)Methods    3)Constructor
	 */
	
	private String VehicleNUM="MP09HJH4526";//it is private variable
	public String VehicleType="four-Wheeler";//it is public variable
	public String VehicleModel="MARUTI";
	
	public static void Vehicles(){
		System.out.println("Details of Vehicles:");
		
			
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicles();
		
		
		Show ve=new Show();//creating object of class Vehicles
		System.out.println("Vehicle Number:"+ve.VehicleNUM+" "+" Vehicle Type:"+ve.VehicleType+" "+"Vehicle Model:"+ve.VehicleModel);
	
		
		
	}
}
	