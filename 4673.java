// 4673 셀프 넘버

public class Main {
	public static void main(String[] args) throws Exception {
		int N = 1;
		int selfNumber[] = new int[11000];
		int sNum = 0;
		while (true) {
			if (N / 10 == 0) 
				sNum = N + (N % 10);
			else if (N / 100 == 0)
				sNum = N + (N / 10) + (N % 10);
			else if (N / 1000 == 0)
				sNum = N + (N / 100) + ((N / 10) % 10) + (N % 10);
			else if (N / 10000 == 0)
				sNum = N + (N / 1000) + ((N / 100) % 10) + ((N / 10) % 10) + (N % 10);
			
			if (N > 10000)
				break;
			selfNumber[sNum] = -1;
			N++;
		}
		N = 1;
		while (N <= 10000) {
			if (selfNumber[N] == 0)
				System.out.println(N);
			N++;
		}
	}	
}
