import java.io.*;
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 선언
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); // 선언
		// StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		Integer N = Integer.parseInt(br.readLine());
		for (int i = N; i > 0; i--) {
			bw.write(Integer.toString(i));
			bw.newLine();
		}
		bw.flush();
	}
}