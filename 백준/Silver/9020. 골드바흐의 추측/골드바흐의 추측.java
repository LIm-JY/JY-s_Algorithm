import java.io.*;
import java.util.*;
public class Main {
	// 1. 소수: false
	// 2. 소수X: true
	public static boolean[] prime_9020 = new boolean[10001]; 
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 선언
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); // 선언
		// StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		get_prime_9020();	// 소수를 얻는 메소드 실행
		int T = Integer.parseInt(br.readLine());
		for (int i = T; i > 0; i--) {
			int n = Integer.parseInt(br.readLine());
			int a = n/2;
			int b = n/2;
			while (true) {
				if (prime_9020[a]==false && prime_9020[b]==false) {
					bw.write(Integer.toString(a)+" "+Integer.toString(b));
					bw.newLine();
					break;
				}
				a--;
				b++;
			}
		}
		bw.flush();
		bw.close();
	}
	// 6번 에라토스테네스의 체 알고리즘
	public static void get_prime_9020() {
		// true = 소수아님 , false = 소수 
		prime_9020[0] = prime_9020[1] = true;
		
		for(int i = 2; i <= Math.sqrt(prime_9020.length); i++) {
			if(prime_9020[i]) {
				continue;
			}
			for(int j = i * i; j < prime_9020.length; j += i) {
				prime_9020[j] = true;
			}
		}
	}
}