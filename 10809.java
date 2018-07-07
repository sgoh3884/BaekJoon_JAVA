// 10809 알파벳 찾기
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int alphabets[] = new int[26];
		for (int i = 0; i < 26; i++) 
			alphabets[i] = -1;
		
		for (int i = 0; i < str.length(); i++) {
			char alpha = str.charAt(i);
			if (alphabets[(int)alpha-97] == -1)
				alphabets[(int)alpha-97] = i;
		}
		
		for (int i = 0; i < 26; i++) 
			System.out.print(alphabets[i] + " ");
		System.out.println();
	}
}
