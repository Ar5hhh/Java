package sample;

class Bank
{
	int getROi()
	{
		return 0;
	}
}
class SBI extends Bank
{
	int getROI()
	{
		return 6;
	}
}
class AXIS extends Bank
{
	int getROI()
	{
		return 7;
	}
}
class HDFC extends Bank
{
	int getROI()
	{
		return 8;
	}
}

 class Override {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
SBI s=new SBI();	
AXIS a=new AXIS();
HDFC h=new HDFC();
System.out.println("SBI rate of interest="+s.getROI());
System.out.println("AXIS rate of interest="+a.getROI());		
System.out.println("HDFC rate of interest="+h.getROI());
	}
 }
