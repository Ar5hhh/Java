package sample;
class A1
{
	protected int n=20;
}
class B1 extends A1
{
protected int bb()
{
   return n;	
}
}
class C1 extends B1
{
void Display()
{
	System.out.println("VALUE:"+n);
}
}

public class AccMod1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//B b=new B();
		//b.run();
		C1 c=new C1();
		c.Display();
		

	}

}
