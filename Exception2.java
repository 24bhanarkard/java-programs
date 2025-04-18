package exce1;
class A1{
		void display()
		{
			try
			{
				String Str = null;
				System.out.println(Str.length());
			}
			catch(NullPointerException e)
			{
				System.out.println(e);
			}
			System.out.println("Exception Handled");

		}
	
}

public class Exception3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A1 a= new A1();
		a.display();
		
	}

}



java.lang.NullPointerException: Cannot invoke "String.length()" because "Str" is null
Exception Handled