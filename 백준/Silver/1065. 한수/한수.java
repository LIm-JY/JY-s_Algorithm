import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 선언
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); // 선언
		String res = String.valueOf(arithmeticSeq_beak_1065(Integer.parseInt(br.readLine()))); // 결과 값 = 한수를 구하는 함수에 입력받은 한 수를 넣은 값 
		bw.write(res);
		bw.flush();
		bw.close();
	
	}
	// 3. 한수
	public static int arithmeticSeq_beak_1065(int n) {
		int cnt = 0; // 한수 카운트
		// n이 100보다 작을 때
		if(n < 100){
			return n;
		}
		// 100보다 클 때
		else {
			cnt = 99; // 카운트는 99부터
			for (int i = 100; i <= n; i++) {
				int hun = i / 100;		 // 백의 자릿수
				int ten = (i / 10) % 10; // 십의 자릿수
				int one = i % 10;   	 // 일의 자리수
	            
				// 각 자릿수가 수열을 이룰 때
				if((hun - ten) == (ten - one)){
					cnt++; // 카운트 ++
				}
			}
		}
		return cnt;
	}
}