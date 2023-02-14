import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 선언
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); // 선언
		int N = Integer.parseInt(br.readLine()); // 주어진 수
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int cnt = 0; // 소수의 개수
		for (int i = 0; i < N; i++) {
			// 소수인경우 true, 아닌경우 false   
			boolean isPrime = true;
			int num = Integer.parseInt(st.nextToken()); // 첫째 줄에 N이 주어진다. (3 ≤ N ≤ 5000)
			// 1은 소수가 아님.
			if(num == 1) {
				continue; // 다음 반복문으로
			}
			// 소수를 판별할 때 num의 제곱근 까지만 검사하면 된다.
			for (int j = 2; j <= Math.sqrt(num); j++) {
				if(num%j == 0) {
					isPrime = false;
					break;
				}
			}
			// true일 경우 cnt++;
			if (isPrime) {
				cnt++;
			}
		}
		bw.write(String.valueOf(cnt));
		bw.flush();
		bw.close();
	}
}