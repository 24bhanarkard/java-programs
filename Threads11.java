package threads1;

class a1 extends Thread
{
	public void run()
	{
		while(true)
		{
			System.out.println("hello");
			System.out.println("world");
		}
	}
}

class a2 extends Thread
{
	public void run()
	{
		while(true)
		{
			System.out.println("i am happy");
			System.out.println("i am using jav");
		}
	}
}

public class Threads11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		a1 a = new a1();
		a2 b = new a2();
		b.start();
		a.start();

	}

}
