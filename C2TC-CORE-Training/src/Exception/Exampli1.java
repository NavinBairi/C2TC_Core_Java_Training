package Exception;

public class Exampli1 {

	public static void main(java.lang.String[] args) {
		// TODO Auto-generated method stub
  try {
	 int x = 20/0;
	  
  }
  catch(ArithmeticException e){
	  System.out.println(e);
	  
  }
  System.out.println("rest of code ");
  
	}

}
