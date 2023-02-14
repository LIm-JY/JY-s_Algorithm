import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 선언
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); // 선언
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(st.nextToken()); // 주어진 수
		// N이 1이 아닐 때
		if(N!=1) {
			for (int i = 2; i <= N; i++) {
				while (N%i==0) {
					bw.write(String.valueOf(i)); // 출력
					bw.newLine(); // 줄바꿈
					N = N/i;
				}
			}
		}
		bw.flush();
		bw.close();
	}
}