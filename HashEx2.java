package sample;
import java.util.*;
public class HashEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Map m=new HashMap();
       //LinkedHashMap m=new LinkedHashMap();
     // TreeMap m=new TreeMap();
		
     m.put(1,"MONDAY");
     m.put(6,"SATURDAY");
     m.put(5,"FRIDAY");
     m.put(3,"WEDNESDAY");
     m.put(4,"THURSDAY");
     m.put(2,"TUESDAY");
     m.put(7,"SUNDAY");
		Set s=( m).keySet();
		Collection c=m.values();
		Set s1=m.entrySet();
		
		System.out.println(s+"\n"+c+"\n"+s1);
		
	

	}

}


