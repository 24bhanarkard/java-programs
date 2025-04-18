package enum1;
enum Days
{
	Monday,
	Tuesday,
	Wednesday,
	Thursday,
	Friday,
	Saturday,
	Sunday
}

public class Enum1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Days a = Days.Monday;
		
		switch(a)
		{
		case Monday:
			System.out.println("1st day");
			break;
		case Tuesday:
			System.out.println("2nd day");
			break;
		case Wednesday:
			System.out.println("3rd day");
			break;
		case Thursday:
			System.out.println("4th day");
			break;
		case Friday:
			System.out.println("5th day");
			break;
		case Saturday:
			System.out.println("6th day");
			break;
		case Sunday:
			System.out.println("7th day");
			break;
		}
		
	}

}
