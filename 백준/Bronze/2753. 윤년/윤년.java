import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 선언
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int a = Integer.parseInt(st.nextToken());
		int b = 0;
		// 1. 4의 배수이며
		if(a%4==0) {
			if (a%100!=0 || a%400==0) {
				b = 1;
			}
		}
		// 첫째 줄에 윤년이면 1, 아니면 0을 출력한다.
		System.out.println(b);
	}
}