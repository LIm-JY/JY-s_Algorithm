import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 선언
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int hour = Integer.parseInt(st.nextToken());
		int min = Integer.parseInt(st.nextToken());
		int cookTime = Integer.parseInt(br.readLine());
		int cookHour = (min + cookTime) / 60;
		
		// 첫째 줄에 종료되는 시각의 시와 분을 공백을 사이에 두고 출력한다. (단, 시는 0부터 23까지의 정수, 분은 0부터 59까지의 정수이다. 디지털 시계는 23시 59분에서 1분이 지나면 0시 0분이 된다.)
		int a = hour+cookHour;
		if(a > 23){
			a -= 24;
		}
		// 분 + 쿠킹시간이 60보다 크거나 같을 때
		if(min + cookTime>=60) {
			System.out.println(a+" "+((int)(min+cookTime)-(int)(60*cookHour)));
		}else {
			System.out.println(a+" "+(int)(min+cookTime));
		}
	}
}