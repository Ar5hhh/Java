package sample;
import java.util.*;
public class SetEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set s=new HashSet();
		s.add(1);
		s.add("TWO");
		s.add("3");
		s.add (new Integer(4));
		s.add(new Float(5.0F));
		s.add("TWO");
		System.out.println(s);
		

	}
}
