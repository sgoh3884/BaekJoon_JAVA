// 2675 문자열 반복
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String result[] = new String[N];
		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int R = Integer.parseInt(st.nextToken());
			String S = st.nextToken();
			result[i] = "";
			for (int j = 0; j < S.length(); j++) {
				for (int k = 0; k < R; k++)
					result[i] += S.charAt(j);
			}
		}
		for (int i = 0; i < N; i++)
			System.out.println(result[i]);
	}
}
