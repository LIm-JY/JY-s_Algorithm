import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 선언
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); // 선언
		int len = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		double[] arr = new double[len];
		for (int i = 0; i < len; i++) {
			int a = Integer.parseInt(st.nextToken());
			arr[i] = a;
		}
		Arrays.sort(arr);
		double n = 0.0d;
		for (int i = 0; i < arr.length; i++) {
			n += (arr[i]/arr[arr.length-1])*100;
		}
		n = n/len;
		
		bw.write(String.valueOf(n));
		bw.flush(); // 남아있는 데이터 모두 출력
	}
}