import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 선언
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		// 1. 같은 눈이 3개가 나오면 10,000원+(같은 눈)×1,000원의 상금을 받게 된다.
		// 2. 같은 눈이 2개만 나오는 경우에는 1,000원+(같은 눈)×100원의 상금을 받게 된다.
		// 3. 모두 다른 눈이 나오는 경우에는 (그 중 가장 큰 눈)×100원의 상금을 받게 된다.
		int answer = 0;
		if(a==b||a==c||b==c) {
			if(a==b) {
				answer = 1000 + a*100;
			}
			if(a==c) {
				answer = 1000 + a*100;
			}
			if(b==c) {
				answer = 1000 + b*100;
			}
			if(a==b&&b==c) {
				answer = 10000 + a*1000;
			}
		}else {
			// a가 b보다 클 때
			if(a>b) {
				// a가 c보다 클 때
				if(a>c) {
					answer = a*100;
				}else {
					answer = c*100;
				}
			}
			// a가 b보다 작을 때
			else {
				// b가 c보다 클 때
				if(b>c) {
					answer = b*100;
				}else {
					answer = c*100;
				}
			}
		}
		System.out.println(answer);
	}
}