import java.io.*;
import java.util.*;
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 선언
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); // 선언
		int A = Integer.parseInt(br.readLine());
		int B = Integer.parseInt(br.readLine());
		bw.write(Integer.toString(A+B));
		bw.flush();
	}
}