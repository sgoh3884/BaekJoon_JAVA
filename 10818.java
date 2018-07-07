// 10818 최소, 최대
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int max = -1000000;
		int min = 1000000;
		for (int i = 0; i < N; i++){
			int num = Integer.parseInt(st.nextToken());
			if (max <= num) max = num;
			if (min >= num) min = num;
		}
		System.out.println(min + " " + max);
	}
} 