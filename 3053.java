// 3053 택시 기하학
import java.io.*;
import java.text.DecimalFormat;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
		DecimalFormat df = new DecimalFormat("0.000000");
		int T = Integer.parseInt(br.readLine());
	
		System.out.println(df.format(T * T * Math.PI));
		System.out.println(df.format(T * T * 2));
	}
} 
