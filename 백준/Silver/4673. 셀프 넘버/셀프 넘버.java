import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); // 선언
		int[] arr = new int[10001]; // 10000개 이상인 것들을 담아줄 배열
		// 함수를 for문을 이용하여 돌린다.
		for (int i = 1; i < 10001; i++) {
			int result = selfNumber_beak_4673(i); // 함수 진입
			if(result < 10001) {
				arr[result]++;
			}
		}
		for (int i = 1; i < 10001; i++) {
			// 0인 인덱스 출력
			if (arr[i]==0) {
				bw.write(String.valueOf(i));
				bw.newLine();
			}
		}
		bw.flush(); // 남아있는 데이터 모두 출력
	}
	// 2. 셀프 넘버 
	public static int selfNumber_beak_4673(int n) {
		int sum = n; // sum으로  return
		// n이 0이 아니면
		while(n != 0){
			sum += (n % 10); // 첫 째 자리수
			n = n/10;	// 10을 나누어 첫 째 자리를 없앤다
		}
		return sum;
	}
}