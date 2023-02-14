import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 선언
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); // 선언
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(st.nextToken());
		int temp = N;
		int count = 0;
		
		while(true) {
			int left  = temp/10;
			int right = temp%10;
			temp = right * 10 + (left + right) % 10;
			count++;
			if (N == temp) {
				break;
			}
		}
		bw.write(String.valueOf(count));
		bw.flush(); // 남아있는 데이터 모두 출력
	}
}