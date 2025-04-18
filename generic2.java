package mar27;

public class Box<T> {
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
		Box<Integer> integerBox = new Box<Integer>();
		Box<String> stringBox = new Box<String>();
		integerBox.add((10));
		stringBox.add("hello world");
		System.out.printf("integer value is:%d\n\n",integerBox.get());
		System.out.printf("string values: %s\n",stringBox.get());
		

		

	}

}





integer value is:10

string values: hello world
