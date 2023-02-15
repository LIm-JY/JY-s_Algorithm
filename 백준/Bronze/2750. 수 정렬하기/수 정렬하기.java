import java.io.*;
import java.util.*;
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 선언
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); // 선언
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		for (int i = 0; i < N; i++) {
			int a = Integer.parseInt(br.readLine());
			arr[i] = a;
		}
		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			bw.write(Integer.toString(arr[i]));
			bw.newLine();
		}
		bw.flush();
	}
}