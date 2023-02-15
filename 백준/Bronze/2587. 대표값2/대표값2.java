import java.io.*;
import java.util.*;
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 선언
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); // 선언
		int[] arr = new int[5]; // 입력 값 받아줄 배열
		for (int i = 0; i < arr.length; i++) {
			int a = Integer.parseInt(br.readLine());
			arr[i] = a;
		}
		int res1 = (arr[0]+arr[1]+arr[2]+arr[3]+arr[4])/5;
		Arrays.sort(arr);
		bw.write(Integer.toString(res1));
		bw.newLine();
		bw.write(Integer.toString(arr[2]));
		bw.flush();
	}
}