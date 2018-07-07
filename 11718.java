// 11718 그대로 출력하기
import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int count = 1;
		while (str != null && count <= 100) {
			if (!str.startsWith(" ") && !str.endsWith(" "))
				System.out.println(str);
			str = br.readLine();
			count++;
		}
	}
}
