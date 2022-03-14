package sample;
interface Inf
{
	void display();
}
 public class  interf implements Inf 
{
	public void display()
	{
		System.out.println("INTERFACE");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		interf i=new interf();
		i.display();

	}

}
