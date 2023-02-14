import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 선언
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); // 선언
		int T = Integer.parseInt(br.readLine());
		for (int i = 1; i <= T; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
    		int A = Integer.parseInt(st.nextToken());
    		int B = Integer.parseInt(st.nextToken());
    		int res = A+B;
    		if(i < T) {
    			bw.write(String.valueOf("Case #"+i+": "+res));
    			bw.newLine(); // 줄바꿈
    		}else {
    			bw.write(String.valueOf("Case #"+i+": "+res));
    		}
		}
		bw.flush(); // 남아있는 데이터 모두 출력
	}
}