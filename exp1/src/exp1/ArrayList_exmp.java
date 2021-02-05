 package exp1;

import java.util.ArrayList;

public class ArrayList_exmp{
		public static void main(String[] args) {
			
			ArrayList<String> obj = new ArrayList<String>();
			obj.add("Manasa");
			obj.add("Sivani");
			obj.add("Bhargavi");
			obj.add("Hamsini");
			
			System.out.println("The elements in the List:" + obj);
			
			obj.add("Varnika");
			obj.remove("Manasa");
			obj.remove("Sivani");
			
			System.out.println("The elements in the List:" + obj);
			obj.remove(1);
			
			System.out.println("The elements in the List:" + obj);
		}
}

