// 1546 평균
import java.io.*;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int level[] = new int[N];
		float max = 0;
		float maxLevel = 0;
		float result = 0;
		for (int i = 0; i < N; i++) {
			level[i]  = Integer.parseInt(st.nextToken());
			if (max < level[i])
				max = level[i];
			maxLevel += level[i];
		}
		maxLevel /= N;
		result = 100 * maxLevel / max;
		System.out.println(Math.round(result*100)/100.0);
	}	
}
