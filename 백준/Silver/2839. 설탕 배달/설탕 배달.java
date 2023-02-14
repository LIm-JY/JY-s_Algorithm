import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 선언
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); // 선언
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(st.nextToken()); // 첫째 줄에 N이 주어진다. (3 ≤ N ≤ 5000)
		int result = 0; // 결과값
		// 1. 4나 7이면 3이나 5로 나눠도 될 수 없다.
		if (N == 4 || N == 7) {
			result = -1;
		}
		// 2. 5로 나누었을 때 0이면 N/5
		else if (N % 5 == 0) {
			result = N/5;
		}
		// 3. 5로 나누었을 때 나머지가 1이거나 나머지가 3일 때 (나머지가 1이 나온다면 3의배수가 될 수 있음)
		else if (N % 5 == 1 || N % 5 == 3) {
			result = (N / 5) + 1;
		}
		// 4. 5로 나누었을 때 나머지가 2이거나 나머지가 4일 때 +2
		else if (N % 5 == 2 || N % 5 == 4) {
			result=(N / 5) + 2;
		}
		bw.write(String.valueOf(result));
		bw.flush();
		bw.close();
	}
}