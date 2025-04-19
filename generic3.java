package mar27;
import java.util.*;

public class Generic3<T> {
	
		private T t;
		public void add(T t)
		{
			this.t=t;
		}
		public T get()
		{
			return t;
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int a;
		float b;
		String c;
		
		Box<Integer> integerBox = new Box<Integer>();
		Box<Float> floatBox = new Box<Float>();
		Box<String> stringBox = new Box<String>();
		System.out.print("enter an integer:");
		a=in.nextInt();
		integerBox.add((a));
		
		System.out.print("enter a float value:");
		b=in.nextFloat();
		floatBox.add((b));
		
		System.out.print("enter any string:");
		c=in.next();
		stringBox.add((c));
		
		System.out.printf("\n integer value is:%d",integerBox.get());
		System.out.printf("\n float : %s",floatBox.get());
		System.out.printf("\n string : %s",stringBox.get());
		
		
		
	}

}
