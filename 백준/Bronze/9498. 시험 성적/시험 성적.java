import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 선언
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int a = Integer.parseInt(st.nextToken());
		String s = null;
		if(a<60) {
			s = "F";
		}
		if(a>=60) {
			s = "D";
		}
		if(a>=70) {
			s = "C";
		}
		if(a>=80) {
			s = "B";
		}
		if(a>=90) {
			s = "A";
		}
		// 시험 성적을 출력한다.
		System.out.println(s);
	}
}