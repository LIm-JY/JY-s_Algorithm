import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 선언
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); // 선언
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int A = Integer.parseInt(st.nextToken());	// A 오르는거
		int B = Integer.parseInt(st.nextToken());	// B 내리는거
		int V = Integer.parseInt(st.nextToken()); 	// V 길이
		int reach = (V-B)/(A-B); // 도착시간
		// 나머지가 0보다 크면?
		if((V-B)%(A-B) > 0) {
			reach++; //도착시간++
		}
		bw.write(String.valueOf(reach));
		
		bw.flush();
		bw.close();
	}
}