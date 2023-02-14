import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 선언
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); // 선언
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(st.nextToken()); // 고정 비용
		int cnt = 1;
		int min = 2; // 1은 1개여서 2부터 시작
		// 1이면 1
		if(N==1) {
			bw.write("1");
		}else {
			while(min <=N) {
				min = min + (6*cnt);
				cnt++;
			}
			bw.write(String.valueOf(cnt));
		}
		bw.flush();
		bw.close();
	}
}