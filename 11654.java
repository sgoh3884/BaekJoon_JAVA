// 11654 아스키 코드
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		char ch[] = str.toCharArray();
		System.out.println((int) ch[0]);
	}
}
