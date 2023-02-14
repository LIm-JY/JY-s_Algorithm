import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 선언
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); // 선언
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int A = Integer.parseInt(st.nextToken()); // 고정 비용
		int B = Integer.parseInt(st.nextToken()); // 가변 비용
		int C = Integer.parseInt(st.nextToken()); // 판매가
		if(C <= B) {
			bw.write("-1");
		}else {
			bw.write(String.valueOf((A/(C-B))+1));
		}
		bw.flush();
	}
}