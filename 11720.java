// 11720 숫자의 합 
import java.io.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String num = br.readLine();
		int answer = 0;
		for (int i = 0; i < num.length(); i++) 
			answer += num.charAt(i) - 48;
		System.out.println(answer);
	}
}
