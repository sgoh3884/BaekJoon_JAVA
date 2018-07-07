// 2908 상수
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		A = ((A % 10) * 100) + (((A / 10) % 10) * 10) + (A / 100);
		B = ((B % 10) * 100) + (((B / 10) % 10) * 10) + (B / 100);
		
		System.out.println(A > B ? A : B);
	}
}
