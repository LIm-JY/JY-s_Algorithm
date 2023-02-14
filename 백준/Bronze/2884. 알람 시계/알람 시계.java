import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 선언
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int hour = Integer.parseInt(st.nextToken());
		int min = Integer.parseInt(st.nextToken());
		// 첫째 줄에 상근이가 창영이의 방법을 사용할 때, 설정해야 하는 알람 시간을 출력한다. (입력과 같은 형태로 출력하면 된다.)
		// 분이 45보다 클 때
		if(min >= 45) {
			System.out.println(hour+" "+((int)min-45));
		}else {
			min += 60;
			if(hour == 0) {
				hour = 24;
			}
			System.out.println(hour-1+" "+((int)min-45));
		}
	}
}