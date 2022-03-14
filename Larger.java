package assignment;
import java.util.*;
public class Larger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b;
		Scanner s=new Scanner(System.in);
		System.out.println("ENTER:");
		a=s.nextInt();
		System.out.println("ENTER:");
		b=s.nextInt();
		if(a>b)
		{
			System.out.println(a+" IS LARGER");
		}
		else if(b>a)
		{
			System.out.println(b+" IS LARGER");
		}
		else if (a==b)
		{
			System.out.println("NUMBERS ARE EQUAL");
		}
		

	}

}
