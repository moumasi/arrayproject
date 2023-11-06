package arraypackage;

public class class1 {

	public static void main(String[] args) {
  class1 go = new class1();
  go.foot();
	}
	public void foot() {
		
	double [] obj = {10.21, 50.24, 80.26, 90.25};
	int x = obj.length;
	System.out.println(x);
	System.out.println();
	for(int i = 0; i<obj.length; i ++) {
		System.out.println(obj[i]);
	}
			
	}

}
