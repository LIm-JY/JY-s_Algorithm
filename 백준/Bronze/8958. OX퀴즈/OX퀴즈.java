import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 선언
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); // 선언
		int len = Integer.parseInt(br.readLine()); // 길이
		int cnt = 0;
		for (int i = 0; i < len; i++) {
			String[] a = br.readLine().split("");
			int tmpCnt = 0; // 임시 카운트
			for (int j = 0; j < a.length; j++) {
				if("O".equals(a[j])) {
					tmpCnt++;
					cnt += tmpCnt;
				}else {
					tmpCnt = 0;
				}
			}
			bw.write(String.valueOf(cnt));
			bw.newLine();
			cnt = 0;
		}
		bw.flush(); // 남아있는 데이터 모두 출력
		bw.close(); // 닫기
	}
}