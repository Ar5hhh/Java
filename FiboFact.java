package sample;
import java.util.*;
class Fibonacci
{
	int a=0;
	int b=1;
	int c;
	
public void run(int n)
{
	System.out.println("FIBONACCI SERIES");
	
	for(int i=0;i<=n;i++)
	{
	  System.out.print(a+" " );
	  
	  c=a+b;
	  a=b;
	  b=c;
		
	}
	System.out.println("\n");
}

}
class Factorial
{
	int q=1;
	
public void run(int n)
{
	
	System.out.println("FACTORIAL");
	for(int i=1;i<=n;i++)
	{
		q*=i;
		//System.out.println(i+"!="+q);
	}
	System.out.println("FACTORIAL OF "+n+"="+q);
}
}
public class FiboFact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n;
	    System.out.println("ENTER:");
	    n=s.nextInt();
	    
	    
	    Fibonacci f=new Fibonacci();
	    f.run(n);
	    
	    Factorial f1=new Factorial ();
	    f1.run(n);	
	    
	    s.close();

	}

}
