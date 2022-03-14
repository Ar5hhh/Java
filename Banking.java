package assignment;
import java.util.*;
class Debit
{
 int balance=10000;

   void debit(int d)
{
	if(d<=balance)
	{
		System.out.println("WITHDRAWAL SUCCESSFUL");
		balance-=d;
		System.out.println("BALANCE:"+balance);
	
	}
	else 
	{
		System.out.println("DEBIT AMOUNT EXCEEDED AMOUNT BALANCE");
	    System.out.println("BALANCE:"+balance);
	}
}
	
}
public class Banking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int d;
		System.out.println("ENTER THE AMOUNT TO WITHDRAW:");
		d=s.nextInt();
		Debit de=new Debit();
		de.debit(d);
		}

}
