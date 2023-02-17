import java.io.*;
import java.util.*;
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 선언
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); // 선언
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[8001]; // 정수의 절댓값은 4000을 넘지 않는다. -4000~4000 = 8001
		int[] arr2 = new int[N];
		int avg = 0; // 중앙 값
		int max = Integer.MIN_VALUE; // 최대 값
		int min = Integer.MAX_VALUE; // 최소 값
		for (int i = 0; i < N; i++) {
			int a = Integer.parseInt(br.readLine());
			avg += a; // 산술평균 값 구하기
			arr2[i] += a;
			arr[a+4000]++; // 최빈값 구하기
			
			// 최대 값
        	if(max < a){
                max = a;
        	}
        	// 최소 값
        	if (min > a) {
        		min = a;
			}
		}
		int mode = 10000;
		int modeMax = 0; 	// 최빈값의 최댓값  
		// 이전의 동일한 최빈값이 한 번만 등장했을경우 true or false
		boolean flag = false;
		for(int i = min+4000; i <= max+4000; i++) {
			if(arr[i] > 0) {
				if(modeMax < arr[i]) {
					modeMax = arr[i];
					mode = i - 4000;
					flag = true;	// 첫 등장이므로 true 로 변경 
				}
				// 이전 최빈값 최댓값과 동일한 경우면서 한 번만 중복되는 경우 
				else if(modeMax == arr[i] && flag == true) {
					mode = i - 4000;
					flag = false;					
				}
			}
		}
		// 1. 산술평균
		bw.write(Integer.toString((int)Math.round((double)avg/N)));
		bw.newLine();
		// 2. 중앙값
		Arrays.sort(arr2); // 오름차순 정렬
		bw.write(Integer.toString(arr2[N/2]));
		bw.newLine();
		// 3. 최빈값
		bw.write(Integer.toString(mode));
		bw.newLine();
		// 4. 범위
		bw.write(Integer.toString(max-min));
		bw.flush();
	}
}