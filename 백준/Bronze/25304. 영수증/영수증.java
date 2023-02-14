import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 선언
		int price = Integer.parseInt(br.readLine()); // 영수증 가격
		int n = Integer.parseInt(br.readLine()); // 물건개수
		int a = 0;
		for (int i = 1; i <= n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
    		int cost = Integer.parseInt(st.nextToken());
    		int cnt = Integer.parseInt(st.nextToken());
    		a += cost * cnt;
		}
		if (a==price) {
			System.out.print("Yes");
		}else {
			System.out.print("No");
		}
	}
}