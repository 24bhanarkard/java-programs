package test;

public class bank2 {
	double balance=10000;
	String name;
	double amount;
	
	public bank2() {
		// TODO Auto-generated constructor stub
	}
	
	public void deposit(double amount,String name)
	{
		System.out.println("your balance is:"+balance);
		if(amount>0)
		{
			balance=balance+amount;
			System.out.println(name+ "\t deposited "+amount);
		}
		else
		{
			System.out.println("invalid amount");
		}
		
		System.out.println("the balance is:"+balance);
	}
	
	public void withdraw(double amount,String name)
	{
		if(amount<=balance)
		{
		balance=balance-amount;
		System.out.println(name+ "\t withdrawed" +amount);
		}
		
		else
		{
			System.out.println("insufficient balance");
		}
		System.out.println("the balance is:"+balance);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		bank2 ab=new bank2();
		ab.deposit(5000,"suresh");
		ab.withdraw(3000,"suresh");
		
		System.out.println("\n \n \n");
		
		bank2 abc=new bank2();
		abc.deposit(1000,"ramesh");
		abc.withdraw(20000,"ramesh");

	}

}
