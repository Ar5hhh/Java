package sample;
import java.util.Scanner;
public class MathTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int a;
		int b;
		int n;
		System.out.println("ENTER:");
		a=s.nextInt();
		System.out.println("TILL:");
		n=s.nextInt();
	
		for(int i=1;i<=n;i++)
		{
		     b=a*i;
		     System.out.printf("%dX%d=%d\n",a,i,b);
		}

	}

}
