package mar28;
import java.util.*;

public class HashMap2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String a;
		int i,b=0;
		HashMap<String,Integer> hm = new HashMap<>();
		
		for(i=0;i<2;i++)
		{
			System.out.println("enter a string:");
			a=in.next();
			System.out.println("enter a no:");
			b=in.nextInt();
			hm.put(a,b);
		}
		
		System.out.println(hm);
		
		for(Map.Entry<String,Integer> e : hm.entrySet())
		{
			System.out.print(e.getKey()+"=");
			System.out.println(e.getValue());
			/*System.out.println(e);*/
		}
		

	}

}
