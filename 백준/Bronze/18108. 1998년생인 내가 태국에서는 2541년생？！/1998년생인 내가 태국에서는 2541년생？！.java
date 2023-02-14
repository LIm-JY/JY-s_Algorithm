import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 선언
		StringTokenizer st = new StringTokenizer(br.readLine()  , " ");
		int a = Integer.parseInt(st.nextToken());
		// 태국불기는 543을 빼준다.
		System.out.print(a-543);
	}
}