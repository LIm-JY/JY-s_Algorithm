import java.io.*;
import java.util.*;
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 선언
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); // 선언
		int N = Integer.parseInt(br.readLine());
		String[] arr = new String[N];
		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			arr[i] = st.nextToken();
		}
		Arrays.sort(arr, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				// 1. 길이가 같은 경우
				if(o1.length() == o2.length()) {
					return o1.compareTo(o2);
				}
				// 2. 다른 경우 o1의 길이 - o2의 길이를 리턴
				else {
					return o1.length() - o2.length();
				}
			}
			
		});
		bw.write(arr[0]);
		bw.newLine();
		for (int i = 1; i < N; i++) {
			// 중복되지 않는 단어만 출력
			if (!arr[i].equals(arr[i - 1])) {
				bw.write(arr[i]);
				bw.newLine();
			}
		}
		bw.flush();
	}
}