// 4344 평균은 넘겠지
import java.io.*;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int C = Integer.parseInt(br.readLine());
		float avg[] = new float[C];
		int sum = 0;
		int count = 0;
		int N = 0;
		for (int i = 0; i < C; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			N = Integer.parseInt(st.nextToken());
			int score[] = new int[N];
			for (int j = 0; j < N; j++) {
				score[j] = Integer.parseInt(st.nextToken());
				sum += score[j];
			}
			sum /= N;
			for (int j = 0; j < N; j++) {
				if (sum < score[j]) 
					count++;
			}
			avg[i] = (float) (100.0 * count / N);
			sum = count = 0;
		}
		for (int i = 0; i < C; i++) {
			System.out.printf("%.3f", avg[i]);
			System.out.println("%");
		}
	}	
}
