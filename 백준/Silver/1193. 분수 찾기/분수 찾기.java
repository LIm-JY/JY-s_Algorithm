import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 선언
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); // 선언
		int N = Integer.parseInt(br.readLine()); // 고정 비용

		int cnt = 1;
		int sum = 0;
		// 직전 대각선 누적합 + 해당 대각선 개수 이용한 범위 판별
		while (true) {
		if (N <= sum + cnt) {
			// 대각선의 개수가 홀수일 때
			if (cnt % 2 == 1) { 
				// 분자가 큰 수부터 시작
				// 분자는 대각선상 블럭의 개수 - (X 번째 - 직전 대각선까지의 블럭 개수 - 1) 
				// 분모는 X 번째 - 직전 대각선까지의 블럭 개수
				bw.write((cnt - (N - sum - 1)) + "/" + (N - sum));
				break;
			}
			// 대각선의 개수가 짝수일 때
			else {
				// 홀수일 때의 출력을 반대로 
				bw.write((N - sum) + "/" + (cnt - (N - sum - 1)));
				break;
			}

		} else {
			sum += cnt;
			cnt++;
		}
		}
		bw.flush();
		bw.close();
	}
}
