package mar28;

class animal
{
	void ani()
	{
		System.out.println("hello");
	}
}

class dog extends animal
{
	void ani()
	{
		System.out.println("hiii");
	}
}

public class Overridingg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		animal g1 = new animal();
		dog g2 = new dog();
		g2.ani();

	}

}
