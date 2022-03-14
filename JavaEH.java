package sample;
public class JavaEH {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			int a=10;
			int b=10/0;
			int c[]=new int[5];
			c[6]=15;
			
			
		}
		catch(ArithmeticException e)
		{
			System.out.println("ERROR");
			System.out.println(e);
		}
		
		catch(Exception l)
		{
			
			System.out.println(l);
			
		}
		

	}

}
