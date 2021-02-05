package exp1;

import java.util.Hashtable;
import java.util.Map;

public class HashTable_exmp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Hashtable<Integer, String> obj = new Hashtable<Integer, String>();
		
		obj.put(1, "Anulekha");
		obj.put(2, "Jhansi");
		obj.put(3, "Bhargavi");
		obj.put(4, "Manasa");
		
		for(Map.Entry m:obj.entrySet()){
			System.out.println(m.getKey() + "" + m.getValue());
		}

	}

}
