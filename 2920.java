// 2920 음계
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int input[] = new int[8];
		int ascend[] = {1, 2, 3, 4, 5, 6, 7, 8};
		int descend[] = {8, 7, 6, 5, 4, 3, 2, 1};
		
		for (int i = 0; i < 8; i++)
			input[i] = Integer.parseInt(st.nextToken());
		
		if (Arrays.equals(ascend, input))
			System.out.println("ascending");
		else if (Arrays.equals(descend, input))
			System.out.println("descending");
		else 
			System.out.println("mixed");
	}
}
