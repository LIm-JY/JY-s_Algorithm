import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 선언
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); // 선언
		int cnt = Integer.parseInt(br.readLine());
		for (int i = 1; i <= cnt; i++) {
			for (int j = 1; j <= i; j++) {
				bw.write(String.valueOf("*"));
			}
			bw.newLine(); // 줄바꿈
		}
		bw.flush(); // 남아있는 데이터 모두 출력
	}
}