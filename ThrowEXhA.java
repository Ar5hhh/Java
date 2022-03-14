package sample;
import java.util.*;
public class ThrowEXhA {
	
	public static void run(int a)
	{
		if(a<18)
		{
			throw new ArithmeticException("CANT VOTE");
		}
		else
			System.out.println("VOTE!!!!!!");
		System.out.println("VOTING LIST");
		System.out.println("A\nB\nC");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		Scanner s=new Scanner(System.in);
		System.out.println("ENTER AGE:");
		a=s.nextInt();
		
		//run(a);
		
		
		try {
			run(a);
				}
		catch(ArithmeticException e)
		{
			System.out.println(e);
			System.out.println("LEGAL AGE TO VOTE IS 18");
		}
		s.close();
	}

}
