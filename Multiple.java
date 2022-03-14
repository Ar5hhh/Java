package assignment;
import java.util.*;
public class Multiple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("ENTER a:");
		int a=s.nextInt();
		System.out.println("ENTER b:");
		int b=s.nextInt();
		if(a%b==0)
		{
			System.out.println(a+" IS A MULTIPLE OF "+b);
		}
		else 
			System.out.println(a+" IS NOT A  MULTIPLE OF "+b);
				

	}

}
