import java.io.*;
import java.util.*;
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 선언
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		strange(A, B);
		
	}
	public static void strange(int A, int B) throws IOException {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); // 선언
		int result = (A+B)*(A-B);
		bw.write(Integer.toString(result));
		bw.flush();
	}
}