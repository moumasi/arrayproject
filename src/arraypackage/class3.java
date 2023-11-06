package arraypackage;

public class class3 {

	public static void main(String[] args) {
   class3.hum();
   class3.sad();
   class3.mad();
	}
	public static void hum() {
		int [] far = {1000,2000,3000,4000,5000,6000,7000};
		for(int i= 0; i<far.length; i ++) {
			System.out.println(far[i]);
		}
		
	}
	public static void sad() {
		String [] joy = {"Dhaka","Sylhet","Borishal","Cittagong","Bogurha"};
		System.out.println(joy[3]);
	}
	public static void mad() {
		String [] boy = {"Newyork","Texas","Florida"};
		for(int i=0; i<boy.length; i ++) {
			System.out.println(boy[i]);
			
		}
	}

}
