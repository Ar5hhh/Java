package sample;
class A
{
	protected int n=10;
}
class B extends A
{
protected void run()
{
	System.out.println("NUMBER IN A CLASS:"+n);
}
}
class C extends B
{
	
}

public class AccMod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//B b=new B();
		//b.run();
		C c=new C();
		c.run();
		

	}

}
