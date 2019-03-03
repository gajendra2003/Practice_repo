package constructor;

public class Car {

     String name;
     int speed;
     String manufacture;
     static int  wheel=4;
     public Car(String name, int speed, String manufacture )
     {
    	 this.name=name;
    	 this.manufacture=manufacture;
    	 this.speed=speed;
}
     public Car() {
     }
     
     public void Drive()
     {
    	 System.out.println("Driver "+manufacture+" "+name+" car at the "+speed+" of 60");
     }
     
     
     public void accelarate() {
    	 System.out.println("Driver "+manufacture+" "+name+" car at the "+speed+" of 90");
	
	
}
	}


