package arraypackage;

import java.util.ArrayList;

public class arraylist_class1 {

	public static void main(String[] args) {
  ArrayList row = new ArrayList();
  row.add("Nazmin");
  row.add(500);
  row.add(80.21);
  row.add("Nazmin");
  row.add("Nazmin");
  for(int i=0;i<row.size();i ++) {
	  System.out.println(row.get(i));                  //Normal ArrayList use for Multiple DataType
  }
   int a=row.size();
   System.out.println(a);
  
  System.out.println(row);
  System.out.println(row.get(2));
	}

}
