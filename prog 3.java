package swayam;
import java.util.Scanner;

interface Video_Tape
{	
			String title="Welcome";
			int length=180;
			String available="Yes";
			void show();
}
		
	
	

  class Movie implements Video_Tape
{
	  String director;
	  float rating;
	  void store(String x, double d)
	  {
		  x=director;
		  d=rating;
	  }
	  void display()
		{
			System.out.println("Name of the director is:" +director);
			System.out.println("Rating")
			System.out.println("Category is:" +category);
		}
	
	public void show()
	{
		System.out.println("Title is:" +title);
		System.out.println("Length of the movie is:" +length+ "min");
		System.out.println("Availability:" +available);
		
	}
	public void store(String x, double d) {
		// TODO Auto-generated method stub
		
	}
}

 class Music_Video implements Video_Tape
{
	String artist="arijit singh";
	String category="Bollywood";
	void display()
	{
		System.out.println("Name of the artist is:" +artist);
		System.out.println("Category is:" +category);
	}
	public void show()
	{
		System.out.println("Title is:" +title);
		System.out.println("Length of the movie is:" +length+ "min");
		System.out.println("Availability:" +available);
		
	}
	
}



public class info3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Movie a=new Movie();
		a.display();
		a.store("ravi kishan",3.5);
		a.show();
		System.out.println("\n");
		Music_Video b= new Music_Video();
		b.display();
		b.show();

	}

}
