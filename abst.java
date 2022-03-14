package sample;
abstract class Qwerty
{
	abstract void display();
}

public class abst extends Qwerty
{
	void display()
	{
		System.out.println("ABSTRACT CLASS");
	}
  public static void main(String[] args) {
		// TODO Auto-generated method stub
	  abst a=new abst();
	  a.display();

	}

}
