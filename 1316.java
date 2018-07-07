// 1316 그룹 단어 체커
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int count = 0;

		for (int i = 0; i < N; i++) {
			String str = br.readLine();
			int alpha[] = new int[26];
			char lastStr = '?';
			boolean check = true;
			
			for (int j = 0; j < str.length(); j++) {
				if (lastStr != str.charAt(j) && alpha[str.charAt(j) - 97] != 0) {
					check = false;
					break;
				}
				alpha[str.charAt(j)-97]++;
				lastStr = str.charAt(j);
			}
			if (check)
				count++;
		}
		System.out.println(count);
		
	}
}
