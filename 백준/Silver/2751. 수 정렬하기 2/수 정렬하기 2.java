import java.io.*;
import java.util.*;
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 선언
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); // 선언
		// StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(br.readLine());
		List<Integer> list = new ArrayList<Integer>(); // 입력 값 받아줄 배열
		for (int i = 0; i < N; i++) {
			int a = Integer.parseInt(br.readLine());
			list.add(a);
		}
		Collections.sort(list);
		for (int i = 0; i < list.size(); i++) {
			bw.write(Integer.toString(list.get(i)));
			bw.newLine();
		}
		bw.flush();
	}
}