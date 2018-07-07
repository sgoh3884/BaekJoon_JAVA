// 6603 로또
import java.awt.List;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static String oldAnswer = "";
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
		while (true) {
			String[] T = br.readLine().split(" ");
			int k = Integer.parseInt(T[0]);
			if (k == 0) 
				break;
			String[] S = new String[k];
			for (int i = 1; i <= k; i++) 
				S[i-1] = T[i];
			calculator(6, S, "", 0, 0);
			System.out.println();
		}
	}
	
	public static void calculator(int size, String[] S, String answer, int index, int count) {
		if (size == count) {
			if (oldAnswer != answer) {
				oldAnswer = answer;
				System.out.println(answer.trim());		
			}
		}
		if (S.length == index) return;
		calculator(size, S, answer + " " +  S[index] , index + 1, count + 1);
		calculator(size, S, answer, index + 1, count);
	}
} 