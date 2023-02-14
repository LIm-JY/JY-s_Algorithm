import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 선언
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); // 선언
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int[] arr = new int[26]; // 영문자의 개수는 26개
		char[] strArr = st.nextToken().toUpperCase().toCharArray(); // 대문자로 변경하여 charArray 선언
		
		for (int i = 0; i < strArr.length; i++) {
			// 대문자 범위 65~90
			if (65 <= strArr[i] && strArr[i] <= 90) {
				// 범위에 해당하는 인덱스 값 - 65 증가 (ex A-65 = 0)
				arr[strArr[i]-65]++;
			}
		}
		int max = Integer.MIN_VALUE; // max는 int의 가장 작은 value로 초기화
		char ch = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
				ch = (char)(i+65);
			}else if(arr[i] == max) {
				ch = '?';
			}
		}
		bw.append(ch);
		bw.flush();
		bw.close();
	}
}