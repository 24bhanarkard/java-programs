package recursion1;

public class Rec2 {
	public static void print(int n)
	{
		if(n==6)// base condition
		{
			return ;
		}
		System.out.println(n);
		print(n+1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		print(1);
	}

}
