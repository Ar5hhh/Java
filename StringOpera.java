package sample;
public class StringOpera {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="GAME";
		String b=new String("GAME");
		char ch[]= {'T','H','R','O','N','E','S'};
		String c=new String(ch);
		
		//System.out.printf("%s\n%s\n%s",a,b,c);
		
		
		System.out.println(a.compareTo(b));
		System.out.println(a==b);
	}

}

