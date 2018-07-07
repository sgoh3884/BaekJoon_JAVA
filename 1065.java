// 1065 한수
import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int count;
		int units_Minus_tens;
		int tens_Minus_hundred;
		if (N < 100)
			count = N;
		else {
			count = 99;
			for (int i = 111; i <= N; i++) {
				units_Minus_tens = (i % 10) - ((i / 10) % 10);
				tens_Minus_hundred = ((i / 10) % 10) - (i / 100);
				if (units_Minus_tens == tens_Minus_hundred)
					count++;
			}
		}
		System.out.println(count);
	}	
}
