package assignment;
import java.util.*;
public class SAPSL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c,d,min,max;
        Scanner s=new Scanner(System.in);
		System.out.println("ENTER:");
		a=s.nextInt();
		System.out.println("ENTER:");
		b=s.nextInt();
		System.out.println("ENTER:");
		c=s.nextInt();
		 d=a+b+c;
		System.out.println("SUM:"+d);
		 d=(a+b+c)/3;
		System.out.println("AVERAGE:"+d);
		 d=a*b*c;
		System.out.println("PRODUCT:"+d);
		
		min=a;
		if(b<min)
		{
			min=b;
		}
		if(c<min)
		{
			min=c;
		}
		System.out.println("SMALLEST:"+min);
		
		max=a;
		if(b>max)
		{
			max=b;
		}
		if(c>max)
		{
			max=c;
		}
		System.out.println("LARGEST:"+max);

	}

}
