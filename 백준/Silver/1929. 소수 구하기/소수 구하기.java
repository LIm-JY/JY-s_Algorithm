import java.io.*;
import java.util.*;

public class Main {
	public static boolean[] prime;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 선언
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); // 선언
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int M = Integer.parseInt(st.nextToken()); // 시작 수
		int N = Integer.parseInt(st.nextToken()); // 끝 수
		// 첫째 줄에 자연수 M과 N이 빈 칸을 사이에 두고 주어진다. (1 ≤ M ≤ N ≤ 1,000,000) M이상 N이하의 소수가 하나 이상 있는 입력만 주어진다.
		prime = new boolean[N + 1];
		// 에라토스테네스의 체 알고리즘
		get_prime();
		for(int i = M; i <= N; i++) {
			// false = 소수 
			if(!prime[i]) {
				bw.write(Integer.toString(i));
				bw.newLine();
			}
		}
		bw.flush();
		bw.close();
	}
	// 에라토스테네스의 체 알고리즘
	public static void get_prime() {
		// true = 소수아님 , false = 소수 
		prime[0] = prime[1] = true;
		
		for(int i = 2; i <= Math.sqrt(prime.length); i++) {
			if(prime[i]) continue;
			for(int j = i * i; j < prime.length; j += i) {
				prime[j] = true;
			}
		}
	}
}