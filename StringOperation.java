package sample;

public class StringOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="game";
		String b="of";
		String c=new String("thrones");
		
		System.out.println(a+b+c);
		
		
		System.out.println(a.concat(b).concat(c));
		
		
		System.out.println(String.join("",a,b,c));
		
		
	}

}
