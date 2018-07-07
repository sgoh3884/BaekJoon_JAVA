// 11719 그대로 출력하기2
import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int input = 1;
		while (str != null && input <= 100) {
			System.out.println(str);
			str = br.readLine();
			input++;
		}
	}
}
