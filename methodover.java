package sample;

class Adder{
	public int add(int a,int b)
	{
		return a+b;
	}
	public int add(int a,int b,int c)
	{
		return a+b+c;
	}
}
 class methodover {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Adder a=new Adder();
		System.out.println(a.add(10, 10));
		System.out.println(a.add(10,10,10));

	}

}
