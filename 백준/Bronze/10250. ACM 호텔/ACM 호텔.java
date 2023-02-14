import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 선언
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); // 선언
		int T = Integer.parseInt(br.readLine());	// 테스트데이터 수
		StringTokenizer st;
		for (int i = 0; i < T; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			int H = Integer.parseInt(st.nextToken());	// 호텔의 층수
			int W = Integer.parseInt(st.nextToken());	// 각 층의 방 수
			int N = Integer.parseInt(st.nextToken());	// 몇번 째 손님인지
			int floor = N%H == 0 ? H*100 : (N%H)*100; // 0이면 H로 아니면 N%H 최소 100의 자릿수 부터 시작하므로 *100
			int ho = N%H == 0 ? N/H : (N/H)+1; // N%H가 0이면 N/H 아니면 N/H+1
			int res = floor + ho;
			bw.write(String.valueOf(res));
			bw.newLine();
		}
		bw.flush();
		bw.close();
	}
}