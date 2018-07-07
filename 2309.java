// 2309 일곱 난쟁이
import java.io.*;
import java.util.*;

public class Main {
	public static String oldAnswer = "";
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
		int N = 9;
		String[] height = new String[N];
		for (int i = 0; i < N; i++)
			height[i] = br.readLine();
		calculator(7, 0, height, 0, 0, "");
	}
	
	public static void calculator(int size, int count, String[] height, int total, int index, String ans) {
		if (size == count) {
			if (total == 100) {
				String[] str = ans.trim().split(" ");
				int[] num = new int[str.length];
				for (int i = 0; i < num.length; i++)
					num[i] = Integer.parseInt(str[i]);
				Arrays.sort(num);
				for (int i : num)
					System.out.println(i);
			}
		}
		if (index == height.length) return;
		calculator(size, count + 1, height, total + Integer.parseInt(height[index]), index + 1, ans + " " + height[index]);
		calculator(size, count, height, total, index + 1, ans);
	}
	

} 
