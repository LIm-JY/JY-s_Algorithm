import java.io.*;
import java.util.*;
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 선언
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); // 선언
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		List<Integer> arr = new ArrayList<Integer>();
		// 다장조는 c d e f g a b C, 총 8개 음
		for (int i = 0; i < 8; i++) {
			arr.add(Integer.parseInt(st.nextToken()));
		}
		String res = null;
		for (int i = 0; i < arr.size()-1; i++) {
			if(arr.get(i+1) == arr.get(i)+1) {
				res = "ascending";
			}else if(arr.get(i+1) == arr.get(i)-1) {
				res = "descending";
			}else {
				res = "mixed";
				break;
			}
		}
		bw.write(res);
		bw.flush();
	}
}