package mar22;
import java.util.*;

public class ArrayList1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(12);
		a.add(43);
		a.add(56);
		a.add(74);
		a.add(91);
		/*System.out.println(a);
		System.out.println(a.get(1));
		a.remove(2);
		System.out.println(a);
		System.out.println(a.size());
		a.clear();
		System.out.println(a);*/
		
		/*int i;
		for(i=0;i<a.size();i++)
		{
			System.out.println(a.get(i));
		}*/
		
		for(int i:a)
		{
			System.out.println(i);
		}

	}

}
