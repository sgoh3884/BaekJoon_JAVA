// 1193 분수찾기
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int index = 1;
		int num = 0;
		while (num < N)
			num += index++;
		int cnt = num - N;
		int start;
		int end = index;
		for (start = 0; start <= cnt; start++)
			end--;
		System.out.println(index % 2 == 0 ? start + "/" + end : end + "/" + start);
	}
}
