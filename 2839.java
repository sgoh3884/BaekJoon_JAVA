// 2839 설탕 배달
import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int num[] = new int[5001];
		for (int i = 3; i <= N; i++) {
			num[i] = 999;
			if (i % 3 == 0) num[i] = (int) i / 3;
			if (i % 5 == 0) num[i] = (int) i / 5;
			if (i >= 8 && num[i - 3] != 999) num[i] = Math.min(num[i - 3] + 1, num[i]);
			if (i >= 8 && num[i - 5] != 999) num[i] = Math.min(num[i - 5] + 1, num[i]);
		}
		if (num[N] != 999)
			System.out.println(num[N]);
		else
			System.out.println("-1");
	}
}
