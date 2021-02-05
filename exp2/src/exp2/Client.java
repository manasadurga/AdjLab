package exp2;
import java.net.*;
import java.util.Scanner;
import java.io.*;
public class Client {

	public static void main(String[] args) {
		try {
			//int count = 0;
			Scanner sc = new Scanner(System.in);
			Socket ss = new Socket("localhost", 2004);
			Scanner sc1 = new Scanner(ss.getInputStream());
			System.out.println("Enter a String:");
			String str = sc.nextLine();
			System.out.println("Enter sub string: ");
			String str1 = sc.nextLine();
		
			PrintStream p = new PrintStream(ss.getOutputStream());
			p.println(str);
			p.println(str1);
			
			int count = sc1.nextInt();
			System.out.println("The number of occurrences of given string in main string is: " + count);
			ss.close();

		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}

}
