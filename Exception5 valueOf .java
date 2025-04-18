package exce1;

public class Exception2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			String Str ="null";
			int num = Integer.valueOf(Str);
		}
		catch(NumberFormatException e)
		{
			System.out.println(e);;
		}
		finally
		{
			System.out.println("Exception Handled!");
		}

	}

}


java.lang.NumberFormatException: For input string: "null"
Exception Handled!
