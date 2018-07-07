// 1924 2007년
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		String[] mon = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());
		
		for (int i = 1; i <= 12; i++) {
			if (x != i) {
				if (i == 2)
					y += 28;
				else if (i == 4 || i == 6 || i == 9 || i == 11)
					y += 30;
				else 
					y += 31;
			}
			else 
				break;
		}
		System.out.println(mon[y % 7]);
	}
} 