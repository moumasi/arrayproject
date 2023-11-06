package arraypackage;

import java.util.ArrayList;

public class generic_arraylist {

	public static void main(String[] args) {
// generic ArrayList use for specific DataType
		
		ArrayList<String> happy = new ArrayList();
		happy.add("java");
		happy.add("java");
		happy.add("java");
		happy.add("cucumber");
		happy.add("selenium");
		happy.remove(4);     // for remove any value
		boolean t=happy.contains("cucumber"); //for checking value is there or no
		System.out.println(t);
		                      //for one by one result we have to use Advance for loop
		for(String a:happy) {
			System.out.println(a);
		}
		System.out.println(happy); // to get multiple value
		System.out.println(happy.get(3)); //for get single value
	}

}
