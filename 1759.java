// 1759 암호 만들기
import java.io.*;
import java.util.*;

public class Main {
	public static String oldPassword = "";
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
		StringTokenizer st = new StringTokenizer(br.readLine());
		int L = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());
		String[] alpha = br.readLine().split(" ");
		Arrays.sort(alpha);
		calculator(L, alpha, "", 0);
	}
	
	public static void calculator(int L, String[] alpha, String password, int i) {
		if (password.length() == L) {
			if (check(password)) {
				if (oldPassword != password) {
					oldPassword = password;
					System.out.println(password);
				}
			}
		}
		if (i == alpha.length) return;
		calculator(L, alpha, password + alpha[i], i + 1);
		calculator(L, alpha, password, i + 1);
	}
	
	public static boolean check(String password) {
		int consonant = 0;
		int vowel = 0;
		for (int i = 0; i < password.length(); i++) {
			char ch = password.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
				vowel++;
			else
				consonant++;
		}
		
		return consonant >= 2 && vowel >= 1;
	}
	
} 
