import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 선언
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); // 선언
		LinkedList<Integer> list = new LinkedList<Integer>(); // 둘째 줄을 담아줄 리스트
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(st.nextToken()); // 첫째 줄 - 1
		int X = Integer.parseInt(st.nextToken()); // 첫째 줄 - 2
		
		st = new StringTokenizer(br.readLine(), " ");
		
		for (int i = 0; i < N; i++) {
			list.add(Integer.parseInt(st.nextToken())); // 둘째 줄
		}
		
		StringBuilder sb = new StringBuilder();
		// X와 같은 수를 리스트에서 찾아준다.
		for (int i = 0; i < list.size(); i++) {
			if(list.get(i) < X) {
				sb.append(list.get(i)).append(" ");;
			}
		}
		bw.write(String.valueOf(sb).trim());
		bw.flush(); // 남아있는 데이터 모두 출력
	}
}