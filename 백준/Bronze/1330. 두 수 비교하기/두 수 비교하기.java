import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 선언
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		// 1. A가 B보다 클 때
		if(A > B) {
			System.out.print(">");
		}
		// 2. A가 B보다 작을 때
		if(A < B) {
			System.out.print("<");
		}
		// 3. A랑 B가 같을 때
		if(A == B) {
			System.out.print("==");
		}
	}
}