import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 선언
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); // 선언
		int[] arr = new int[31];
		for (int i = 0; i < 28; i++) {
			int a = Integer.parseInt(br.readLine());
			arr[a] = 1;
		}
		for (int i = 1; i <= arr.length-1; i++) {
			if(arr[i]!= 1) {
				bw.write(String.valueOf(i));
				bw.newLine();
			}
		}
		
		bw.flush(); // 남아있는 데이터 모두 출력
	}
}