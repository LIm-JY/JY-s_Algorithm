import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 선언
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); // 선언
		int len = Integer.parseInt(br.readLine());
		String[] splStr = br.readLine().split(""); // 문자열을 공백으로 스플릿
		if(splStr.length != len) {
			bw.write("문자열 길이가 다름");
		}
		int sum = 0; // splStr의 합
		for (int i = 0; i < splStr.length; i++) {
			sum += Integer.parseInt(splStr[i]);
		}
		bw.write(String.valueOf(sum));
		bw.flush();
		bw.close();
	}
}