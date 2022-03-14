package sample;

public class ProsArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double[] mylist= {1.2,2.5,3.5,4.6};
		for(int i=0;i<mylist.length;i++)
		{
			System.out.println(mylist[i]+"");
		}
		double total=0;
		for(int i=0;i<mylist.length;i++)
		{
		total+=mylist[i];	
		}
		System.out.println(total);
	}

}
