import java.io.*;
import java.util.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 선언
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); // 선언
	public static void main(String[] args) throws IOException {
		int len = Integer.parseInt(br.readLine());
		int cnt = 0;
 
		for (int i = 0; i < len; i++) {
			if (check()) {
				cnt++;
			}
		}
		bw.write(String.valueOf(cnt));
		bw.flush();
		bw.close();
	}
	public static boolean check() throws IOException {
		boolean[] check = new boolean[26];
		int prev = 0;
		String str = br.readLine();
		
		for(int i = 0; i < str.length(); i++) {
			int now = str.charAt(i);	// i 번째 문자 저장 (현재 문자)
			// 앞선 문자와 i 번째 문자가 같지 않다면?
			if(prev != now) {
				// 해당 문자가 처음 나오는 경우 (false 인 경우)
				if(!check[now - 97]){
					check[now - 97] = true;	// true 로 바꿔준다
					prev = now;				// 다음 턴을 위해 prev 도 바꿔준다 
				}
				// 해당 문자가 이미 나온 적이 있는 경우 (그룹단어가 아니게 됨) 
				else {
					return false;	//함수 종료
				}
			}
			// 앞선 문자와 i 번째 문자가 같다면? (연속된 문자)
			else {
				continue;
			}
		}
		return true;
	}
}