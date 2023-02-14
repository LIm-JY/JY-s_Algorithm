import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 선언
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); // 선언
		int len = Integer.parseInt(br.readLine());
		StringTokenizer st;
		for (int i = 0; i < len; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			int a = Integer.parseInt(st.nextToken());
			char[] arr = st.nextToken().toCharArray();
			for (int j = 0; j < arr.length; j++) {
				for (int j2 = 0; j2 < a; j2++) {
					bw.write(arr[j]);
				}
			}
			bw.newLine();
		}
		bw.flush();
		bw.close();
	}
}