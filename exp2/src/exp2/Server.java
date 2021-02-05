package exp2;
import java.net.*;
import java.io.*;
import java.util.*;
public class Server {

	public static void main(String[] args) {
		try {
			ServerSocket ss = new ServerSocket(2004);
			System.out.println("Waiting for Client class");
			Socket so = ss.accept();
			Scanner sc = new Scanner(so.getInputStream()); //accept the input from the client
			String str = sc.nextLine();
			String str1 = sc.nextLine();
			
			int count = 0;
			int m = str.length();
			int n = str1.length();
			for(int i = 0; i <= m-n; i++) {
				int j;
				for(j = 0; j < n; j++) {
					 if (str.charAt(i + j) != str1.charAt(j)) {
		                    break;
		                }
				}
				if (j == n) {                
	                count++;                
	                j = 0;                
	            } 
			}
			
			PrintStream p = new PrintStream(so.getOutputStream());
			p.println(count);
			so.close();
			
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
