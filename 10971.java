// 10971 외판원 순회2
import java.io.*;
import java.util.StringTokenizer;

public class Main {
	static int min = Integer.MAX_VALUE;
	static int W[][];
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
		int N = Integer.parseInt(br.readLine());
		W = new int[N + 1][N + 1];
		int[] numbers = new int[N];
		for (int i = 1; i <= N; i++) {
			numbers[i-1] = i;
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int j = 1; j <= N; j++) 
				W[i][j] = Integer.parseInt(st.nextToken());
		}
		permutation(numbers, 1);
		System.out.println(min);
	}
	
	public static void permutation(int[] numbers, int pivot) {
		if (pivot == numbers.length) {
			boolean ok = true;
			int pass = 0;
			for (int i = 0; i < numbers.length - 1; i++) {
				if (i+1 == numbers.length)
					pass += W[numbers[i]][numbers[0]];
				else 
					pass += W[numbers[i]][numbers[i+1]];
			}
			min = Math.min(min, pass);
		}
		for (int i = pivot; i < numbers.length; i++) {
			swap(numbers, i, pivot);
			permutation(numbers, pivot + 1);
			swap(numbers, i, pivot);
		}
	}
	
	public static void swap(int[] numbers, int i, int j) {
		int temp = numbers[i];
		numbers[i] = numbers[j];
		numbers[j] = temp;
	}
} 
