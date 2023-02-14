import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 선언
		StringTokenizer st = new StringTokenizer(br.readLine()  , " ");
		int a = Integer.parseInt(st.nextToken()); // 킹 1개
		int b = Integer.parseInt(st.nextToken()); // 퀸 1개
		int c = Integer.parseInt(st.nextToken()); // 룩 2개
		int d = Integer.parseInt(st.nextToken()); // 비숍 2개
		int e = Integer.parseInt(st.nextToken()); // 나이트 2개
		int f = Integer.parseInt(st.nextToken()); // 폰 8개
		// 체스는 총 16개의 피스를 사용하며, 킹 1개, 퀸 1개, 룩 2개, 비숍 2개, 나이트 2개, 폰 8개로 구성되어 있다.
		System.out.print((1-a)+" "+(1-b)+" "+(2-c)+" "+(2-d)+" "+(2-e)+" "+(8-f));
	}
}