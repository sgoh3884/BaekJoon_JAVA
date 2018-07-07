// 10819 차이를 최대로
import java.io.*;
import java.util.*;

public class Main {
	static int max = 0;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
		int N = Integer.parseInt(br.readLine());
		int numbers[] = new int[N];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++)
			numbers[i] = Integer.parseInt(st.nextToken());
		
		Arrays.sort(numbers);
		permutation(numbers, 0);
		System.out.println(max);
	}
	
	public static void permutation(int[] numbers, int pivot) {
		if (pivot == numbers.length) {
			int sum = 0;
			for (int i = 1; i < numbers.length; i++)
				sum += Math.abs(numbers[i-1] - numbers[i]);
			max = Math.max(sum, max);
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
