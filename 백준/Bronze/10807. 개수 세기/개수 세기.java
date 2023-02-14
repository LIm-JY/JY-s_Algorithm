import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 선언
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); // 선언
		LinkedList<Integer> list = new LinkedList<Integer>(); // 둘째 줄을 담아줄 리스트
		int len = Integer.parseInt(br.readLine()); // 첫째 줄
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < len; i++) {
			list.add(Integer.parseInt(st.nextToken())); // 둘째 줄
		}
		int cnt = 0; // 몇번 찾는지 세줄 카운트
		int v = Integer.parseInt(br.readLine()); // 셋째 줄
		// v과 같은 수를 리스트에서 찾아준다.
		for (int i = 0; i < list.size(); i++) {
			if(list.get(i) == v) {
				cnt++;
			}
		}
		bw.write(String.valueOf(cnt));
		bw.flush(); // 남아있는 데이터 모두 출력
	}
}