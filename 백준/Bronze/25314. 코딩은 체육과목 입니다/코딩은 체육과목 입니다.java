import java.io.*;
import java.util.*;
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 선언
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); // 선언
		int N = Integer.parseInt(br.readLine());
		for (int i = 1; i <= N/4; i++) {
			if (i == N/4) {
				bw.append("long int");
				break;
			}
			bw.append("long ");
		}
		bw.flush();
	}
}