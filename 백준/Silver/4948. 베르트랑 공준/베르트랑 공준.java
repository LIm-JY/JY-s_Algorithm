import java.io.*;
import java.util.*;

public class Main {
	/*
	n > 123456 이므로 2n 은 최대 246912 이다.
	0 부터 시작하므로 246912 + 1
	*/
	public static boolean[] prime_4948 = new boolean[246913];
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 선언
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); // 선언
		get_prime_4948();	// 소수를 얻는 메소드 실행
		
		while(true) {
			int n = Integer.parseInt(br.readLine());
			if(n == 0) break;	// n 이 0 일경우 종료
            
			int cnt = 0;	// 소수 개수를 셀 변수
            
			for(int i = n + 1; i <= 2 * n; i++) {
				if(!prime_4948[i]) {
					cnt++;
				}
			}
			bw.write(Integer.toString(cnt));
			bw.newLine();
		}
		bw.flush();
		bw.close();
	}
	// 5번 에라토스테네스의 체 알고리즘
	public static void get_prime_4948() {
		// true = 소수아님 , false = 소수 
		prime_4948[0] = prime_4948[1] = true;
		
		for(int i = 2; i <= Math.sqrt(prime_4948.length); i++) {
			if(prime_4948[i]) {
				continue;
			}
			for(int j = i * i; j < prime_4948.length; j += i) {
				prime_4948[j] = true;
			}
		}
	}
}