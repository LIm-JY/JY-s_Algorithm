import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 선언
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); // 선언
		char[] chArr = br.readLine().toCharArray();
		int[] arr = new int[26]; // 소문자의 개수만큼
		for (int i = 0; i < arr.length; i++) {
			arr[i] = -1;
		}
		for (int i = 0; i < chArr.length; i++) {
			if(arr[chArr[i] - 'a'] == -1) {
				arr[chArr[i] - 'a'] = i;
			}
		}
		for (int i = 0; i < arr.length; i++) {
    		bw.write(String.valueOf(arr[i])+" ");
		}
		bw.flush();
		bw.close();
	}
}