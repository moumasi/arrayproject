package arraypackage;

public class arrayloopdecrement {

	public static void main(String[] args) {
   String fruits[]= new String[4];
		   
		   fruits[0]="Apple";
         fruits [1]	="Banana";
         fruits[2]="Mango";
         fruits[3]="Orange";
     for(int i= 3; i>=0; i --){
     System.out.println(fruits[i]);
     }
      String cars[]= new String[5];
      cars[0]="Hunda";
      cars[1]="Toyota";
      cars[2]="Kia";
      cars[3]="BMW";
      cars[4]="Nissan";
      for(int i=4;i>=0;i--) {
    	  System.out.println(cars[i]);
      }
	}

}
