import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 선언
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); // 선언
		
		while (true) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
    		int A = Integer.parseInt(st.nextToken());
    		int B = Integer.parseInt(st.nextToken());
    		if(A == 0 && B == 0) {
    			break;
    		}
			bw.write(String.valueOf(A+B));
			bw.newLine(); // 줄바꿈
		}
		bw.flush(); // 남아있는 데이터 모두 출력
	}
}