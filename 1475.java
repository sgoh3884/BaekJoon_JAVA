// 1475 방 번호
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int[] num = new int[9];
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == '9')
				num[str.charAt(i) - 51]++;
			else
				num[str.charAt(i) - 48]++;
		}
		if (num[6] % 2 == 1) num[6] = num[6] / 2 + 1;
		else num[6] /= 2;
		
		int max = -1;
		for (int i = 0; i < 9; i++) 
			if (max < num[i]) max = num[i];
		System.out.println(max);
	}
} 
