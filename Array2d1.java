package mar12;

public class Array2d1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][]aa= new int [2][2];
		int i,j,a=0;
		for(i=0;i<=1;i++)
		{
			for(j=0;j<=1;j++)
			{
				aa[i][j]=a++;
			}
		}
		for(i=0;i<=1;i++)
		{
			System.out.println("\n"+aa[i][0]+ "\t" +aa[i][1]);
		}

	}

}
