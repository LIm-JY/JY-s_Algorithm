import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 선언
		int A = Integer.parseInt(br.readLine());
		int B = Integer.parseInt(br.readLine());
		String[] splB = String.valueOf(B).split("");
		
		// 첫째 줄부터 넷째 줄까지 차례대로 (3), (4), (5), (6)에 들어갈 값을 출력한다.
		System.out.println(A*Integer.parseInt(splB[2]));
		System.out.println(A*Integer.parseInt(splB[1]));
		System.out.println(A*Integer.parseInt(splB[0]));
		System.out.println(A*B);
	}
}