import java.io.*;
import java.util.*;
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 선언
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); // 선언
		int N = Integer.parseInt(br.readLine());
		int[][] arr = new int[N][2];
		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			arr[i][0] = a;
			arr[i][1] = b;
		}
		// 람다식 사용
		Arrays.sort(arr, (el1, el2) -> {
			if(el1[0] == el2[0]) {
				return el1[1] - el2[1];
			} else {
				return el1[0] - el2[0];
			}
		});
		for (int i = 0; i < arr.length; i++) {
			bw.write(arr[i][0]+" "+arr[i][1]);
			bw.newLine();
		}
		bw.flush();
	}
}