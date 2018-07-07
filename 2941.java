// 2941 크로아티아 알파벳
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int cnt = str.length();
		while (true) {
			if (str.contains("dz=")) { str = str.replaceFirst("dz=", " "); cnt--; }
			else if (str.contains("c=")) str = str.replaceFirst("c=", " ");
			else if (str.contains("c-")) str = str.replaceFirst("c-", " ");
			else if (str.contains("d-")) str = str.replaceFirst("d-", " ");
			else if (str.contains("lj")) str = str.replaceFirst("lj", " ");
			else if (str.contains("nj")) str = str.replaceFirst("nj", " ");
			else if (str.contains("s=")) str = str.replaceFirst("s=", " ");
			else if (str.contains("z=")) str = str.replaceFirst("z=", " ");
			else break;
			cnt--;
		}
		System.out.println(cnt);
	}
}
