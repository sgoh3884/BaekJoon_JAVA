// 9498 시험 성적
import java.io.*;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		if (T >= 90) 
			System.out.println("A");
		else if (T >= 80)
			System.out.println("B");
		else if (T >= 70)
			System.out.println("C");
		else if (T >= 60)
			System.out.println("D");
		else
			System.out.println("F");
	}
}
