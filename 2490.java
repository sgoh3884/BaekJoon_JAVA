// 2490 윷놀이
import java.io.*;

public class Main {	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
		for (int c = 0; c < 3; c++) {
			String[] s = br.readLine().split(" ");
			int ans = 0;
			for (int i = 0; i < s.length; i++) 
				ans += Integer.parseInt(s[i]);
			
			if (ans == 0) System.out.println("D");
			else if (ans == 1) System.out.println("C");
			else if (ans == 2) System.out.println("B");
			else if (ans == 3) System.out.println("A");
			else System.out.println("E");
		}
		

	}
} 
