import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 선언
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); // 선언
		int M = Integer.parseInt(br.readLine()); // 시작 수
		int N = Integer.parseInt(br.readLine()); // 끝 수
		List<Integer> primeList = new ArrayList<Integer>(); // 리스트 생성
		for (int i = M; i <= N; i++) {
			// 소수인경우 true, 아닌경우 false   
			boolean isPrime = true;
			// 1은 소수가 아님.
			if(i == 1) {
				continue; // 다음 반복문으로
			}
			// 소수를 판별할 때 i의 제곱근 까지만 검사하면 된다.
			for (int j = 2; j <= Math.sqrt(i); j++) {
				// 나머지가 0이면 나누어 떨어지는 수 이므로 false 후 break
				if(i%j == 0) {
					isPrime = false;
					break;
				}
			}
			// true일 경우 primeList.add(i) 리스트에 i를 담아준다.;
			if (isPrime) {
				primeList.add(i);
			}
		}
		// 리스트가 비었을 때
		if (primeList.isEmpty()) {
			bw.write("-1"); // -1 출력
		}
		// primeList.get(0)가 빈 상태가 아닐 때 출력해줘야 할 것들
		else {
			int sum = 0; // 소수의 합
			int min = primeList.get(0); // M부터 시작해서 i++로 올라가기 때문에 리스트의 0번 째 에는 리스트의 소수 중 작은  수가 들어있음
			for (Integer pri : primeList) {
				sum+=pri;
			}
			bw.write(String.valueOf(sum)); // 합 출력
			bw.newLine(); // 줄바꿈
			bw.write(String.valueOf(min)); // 최소값 출력
		}
		bw.flush();
		bw.close();
	}
}