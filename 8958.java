// 8958 OX퀴즈
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int result[] = new int[N];		
		for (int i = 0; i < N; i++) {
			String str = br.readLine();
			int score = 1;
			for (int j = 0; j < str.length(); j++) {
				if (str.charAt(j) == 'X') 
					score = 1;
				else if (str.charAt(j) == 'O')
					result[i] += score++;
			}
		}
		for (int i = 0; i < N; i++)
			System.out.println(result[i]);
	}
}
