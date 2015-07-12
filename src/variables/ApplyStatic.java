package variables;

public class ApplyStatic {

	public static void main(String[] args) {
		
	
		
		House house1 = new House();
		//house1.driveWaySize = 12;
		System.out.println("House 1 dive way size : " + house1.driveWaySize);
		
		House house2 = new House();
	    //house2.driveWaySize = 14;
		System.out.println("House 2 dive way size : " + house2.driveWaySize);
		
		System.out.println("House 1 dive way size : " + house1.driveWaySize);
		
		Office.displayOfficeAddress();
		Office.address=10;
		System.out.println(Office.address);

	}

}
