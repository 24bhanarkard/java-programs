package exce1;

public class Exception4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int[] a= {1,2,3,4};
			System.out.println(a[6]);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}

}



java.lang.ArrayIndexOutOfBoundsException: Index 6 out of bounds for length 4
