package sample;

class Add{
	public int add(int a,int b)
	{
		return a+b;
	}
	public double add (double a,double b,double c)
	{
		return a+b+c;
	}
}
 class methodover2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Add a=new Add();
		System.out.println(a.add(10, 10));
		System.out.println(a.add(10.6,10.3,10.7));

	}

}