// 1110 더하기 사이클
import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int answer = N;
		int count = 1;
		while (true) {
			int tens = (int) N / 10;
			int units = (int) N % 10; 
			int newN = tens + units;
			N = (units * 10) + (newN % 10);
			if (N == answer)
				break;
			count++;
		}
		System.out.println(count);		
	}	
}
