import java.io.*;
import java.util.*;
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 선언
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); // 선언
		int[][] arr = new int[9][9];
		for (int i = 0; i < arr.length; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			for (int j = 0; j < arr[i].length; j++) {
				int a = Integer.parseInt(st.nextToken());
				arr[i][j] = a;
			}
		}
		int max  = Integer.MIN_VALUE; // 최대값
		int line = 0; // 행 번호 
		int row  = 0; // 열 번호
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				// 변수에 저장된 최대값보다 클 때
				if(max < arr[i][j]) {
					max  = arr[i][j]; // 최대값 교체
					line = i+1; // 1부터 시작하니깐 +1을 해준다.
					row  = j+1; // 1부터 시작하니깐 +1을 해준다.
				}
			}
		}
		bw.write(Integer.toString(max));
		bw.newLine();
		bw.write(String.valueOf(line+" "+row));
		bw.flush();
	}
}