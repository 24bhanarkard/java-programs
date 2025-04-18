package exce1;

public class Exception11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int a=5/0;
		}
		catch(ArithmeticException e) {
			System.out.println(e.getMessage());;
		}
		finally {
			System.out.println("finally block!");
		}

	}

}
