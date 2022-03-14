package sample;

public class prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int a=19,i,count=0;
	for(i=1;i<=a;i++)
	{
		if(a%i==0){
			count++;
		}
		}
	if(count==2)
		{
			System.out.println("PRIME");
		}
		else
			System.out.println("NOT PRIME");
		
	}
	}