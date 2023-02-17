import java.io.*;
import java.util.*;
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 선언
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); // 선언
		String[] arr = br.readLine().split(""); // N은 1,000,000,000보다 작거나 같은 자연수이다
		Arrays.sort(arr);
		for (int i = arr.length-1; i >= 0; i--) {
			bw.write(arr[i]);
		}
		bw.flush();
	}
}