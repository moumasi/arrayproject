package arraypackage;

public class array_exam1 {

	public static void main(String[] args) {
      int []obj= {100,200,300,400,500,600,700};
      System.out.println(obj.length);
      for(int i=0;i<obj.length;i ++) {
    	  System.out.println(obj[i]);
      }
      for(int a=0;a<=obj.length;a= a+2) {
    	  System.out.println(obj[a]);
      }
      for(int b=1;b<=obj.length;b=b+2) {
    	  System.out.println(obj[b]);
      }
	}

}
