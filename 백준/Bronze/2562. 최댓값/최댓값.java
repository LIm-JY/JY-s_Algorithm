import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 선언
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); // 선언
		int[] arr = new int[9];
		int max = Integer.MIN_VALUE; // 최대값
		int cnt = 0;
		for (int i = 0; i < 9; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
				cnt = i+1;
			}
		}
		StringBuilder sb = new StringBuilder();
		sb.append(max).append("\n").append(cnt);
		bw.write(String.valueOf(sb).trim());
		bw.flush(); // 남아있는 데이터 모두 출력
	}
}