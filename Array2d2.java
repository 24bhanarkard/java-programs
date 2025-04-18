package mar12;
import java.util.Scanner;

public class Array2d2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][]aa= new int [2][2];
		int i,j,a=0;
		Scanner in = new Scanner(System.in);
		System.out.println("enter 4 nos:");
		for(i=0;i<=1;i++)
		{
			for(j=0;j<=1;j++)
			{
				aa[i][j]=in.nextInt();
			}
		}
		for(i=0;i<=1;i++)
		{
			System.out.println("\n"+aa[i][0]+ "\t" +aa[i][1]);
		}

	}


	}

