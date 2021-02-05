package exp1;

import java.util.*;

public class HashMap_exmp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 HashMap hm = new HashMap();
		 
		 hm.put("Manasa", new Double(3434.34)); 
		 hm.put("Sivani", new Double(123.22));
		 hm.put("Bhargavi", new Double(1378.00));
		
		 Set set = hm.entrySet();
		 Iterator i = set.iterator();
		 
		 while(i.hasNext()) {
			 Map.Entry me = (Map.Entry)i.next();
			 System.out.print(me.getKey() + ": ");
			 System.out.println(me.getValue());
		 }
		 
		 System.out.println();
		 
		 double balance = ((Double)hm.get("Manasa")).doubleValue();
		 hm.put("Manasa", new Double(balance + 1000));
		 System.out.println("Manasa's new balance: " + hm.get("Manasa"));
		 }
		
	}
