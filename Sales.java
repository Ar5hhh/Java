package assignment;
import java.util.*;
public class Sales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int number,largest=0,counter=0;
		System.out.println("ENTER:");
		for (int i=1;i<=10;i++)
		{
			number=s.nextInt();
			counter++;
			if(counter==1)
				largest=number;
			 if(number>largest)
				largest=number;
			
		}
		System.out.println("LARGEST:"+largest);
		
	}
}


