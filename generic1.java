aim: write a program using generic class which will take and print parameters of different data types like int, float, char.


package mar27;

public class Generic {
	
	public static<E>void printArray(E[] inputArray)
	{
		for(E element : inputArray)
		{
				System.out.printf("%s",element);
				System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] intArray = {1,2,3,4,5};
		Double[] doubleArray = {23.5, 1.4, 7.9, 3.5};
		Character[] charArray = {'h','e','l','l','o'};
		System.out.println("array integer array contains");
		printArray(intArray);
		System.out.println("\n array double array contains");
		printArray(doubleArray);
		System.out.println("\n array Character array contains");
		printArray(charArray);
		

	}

}
