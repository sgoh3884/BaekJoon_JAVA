// 2667 단지번호붙이기
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
	public static final int[] dx = {0, 0, 1, -1};
	public static final int[] dy = {1, -1, 0, 0};
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
		int N = Integer.parseInt(br.readLine());
		int[][] XY = new int[N+1][N+1];
		for (int i = 1; i <= N; i++) {
			String[] str = br.readLine().split("");
			for (int j = 1; j <= N; j++) 
				XY[i][j] = Integer.parseInt(str[j-1]);
		}
		int count = 0;
		boolean[][] check = new boolean[N+1][N+1];
		Queue<Integer> q = new LinkedList<>();
		int[] ans = new int[50];
		while (true) {	
			boolean findOne = false;
			int x = 0;
			int y = 0;
			for (int i = 1; i <= N; i++) {
				for (int j = 1; j <= N; j++) { 
					if (XY[i][j] == 1) {
						x = i; 
						y = j;
						findOne = true;
						break;
					}
				}
				if (findOne) break;
			}
			if (!findOne) break;
			
			q.add(x);
			q.add(y);
			XY[x][y] = 0;
			check[x][y] = true;
			int nx = 0;
			int ny = 0;
			int num = 1;
			while (!q.isEmpty()) {
				x = q.remove();
				y = q.remove();
				for (int i = 0; i < 4; i++) {
					nx = x + dx[i];
					ny = y + dy[i];
					if (nx >= 1 && nx <= N && ny >= 1 && ny <= N && !check[nx][ny] && XY[nx][ny] == 1) {
						q.add(nx);
						q.add(ny);
						XY[nx][ny] = 0;
						check[nx][ny] = true;
						num++;
					}
				}
			}
			ans[count] = num;
			count++;
		}
		System.out.println(count);
		Arrays.sort(ans);
		for (int i : ans) {
			if (i != 0)
				System.out.println(i);
		}
		br.close();
	}
} 