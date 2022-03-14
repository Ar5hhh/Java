package sample;
abstract class Banks
{
	abstract void display();
}
class IB extends Banks
{
	void display()
	{
		System.out.println("INDIAN BANK-ROI=6");
	}
	
}
class CBI extends Banks
{
	void display()
	{
		System.out.println("CENTRAL BANK OF INDIA-ROI=7");
	}
}
class IOB extends Banks
{
	void display()
	{
		System.out.println("INDIA OVERSEAS BANK-ROI=8");
	}
}
public class AbstractBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IB i=new IB();
		CBI c=new CBI();
		IOB b=new IOB();
		i.display();
		c.display();
		b.display();
		

	}

}