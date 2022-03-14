package sample;
class Parent
{
	void display()
	{
		System.out.println("PARENT");
	}
}
class Child extends Parent {
	void display()
	{
		System.out.println("CHILD");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child c=new Child();
		c.display();
	
		}

	}

