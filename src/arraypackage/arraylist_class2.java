package arraypackage;

import java.util.ArrayList;

public class arraylist_class2 {

	public static void main(String[] args) {
		ArrayList<String> happy = new ArrayList();
		happy.add("java");
		happy.add("java");
		happy.add("java");
		happy.add("cucumber");
		happy.add("selenium");
     System.out.println(happy); // for before clear
     
     // after clear all value
     
    happy.clear();     //for clear all value
    System.out.println(happy);
	}

}
