package mar27;

import java.util.Scanner;

public class Short {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		short z;
		Scanner in = new Scanner(System.in);
		
		try
		{
			System.out.println("enter a short:");
			z=in.nextShort();
		}
		catch(Exception e)
		{
				System.out.println(e);
		}

	}

}



enter a short:
345678
java.util.InputMismatchException: Value out of range. Value:"345678" Radix:10
