// 11721 열 개씩 끊어 출력하기 
import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String answer = "";
		
		for (int i = 0; i < str.length(); i++) {
			if (i % 10 == 0 && i != 0) // 숫자가 0이면 안됨
				answer += '\n';
			answer += str.charAt(i);
		}
		System.out.println(answer);
	}
}
