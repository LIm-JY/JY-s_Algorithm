import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 선언
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); // 선언
		int len = Integer.parseInt(br.readLine()); // 첫째 줄
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int max = Integer.MIN_VALUE; // 최대값
		int min = Integer.MAX_VALUE; // 최소값
		for (int i = 0; i < len; i++) {
			int a = Integer.parseInt(st.nextToken()); // 둘째 줄
			if(a > max) {
				max = a;
			}
			if(a < min) {
				min = a;
			}
		}
		StringBuilder sb = new StringBuilder();
		sb.append(min).append(" ").append(max);
		bw.write(String.valueOf(sb).trim());
		bw.flush(); // 남아있는 데이터 모두 출력
	}
}