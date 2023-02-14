import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 선언
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); // 선언
		/** case 1
		HashSet<Integer> set = new HashSet<Integer>();
		for (int i = 0; i < 10; i++) {
			int a = Integer.parseInt(br.readLine());
			set.add(a%42);
		}
		bw.write(String.valueOf(set.size()));
		bw.flush(); // 남아있는 데이터 모두 출력
		*/
		/** case 2*/
		int[] arr = new int[10];
		for (int i = 0; i < 10; i++) {
			int a = Integer.parseInt(br.readLine());
			arr[i] = a%42;
		}
		int cnt = 0;
		for (int i = 0; i < arr.length; i++) {
			int tmpCnt = 0;
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					tmpCnt++;
				}
			}
			if (tmpCnt == 0) {
				cnt++;
			}
		}
		bw.write(String.valueOf(cnt));
		bw.flush(); // 남아있는 데이터 모두 출력
		
	}
}