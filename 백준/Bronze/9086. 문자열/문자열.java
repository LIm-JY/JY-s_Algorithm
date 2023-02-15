import java.io.*;
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 선언
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); // 선언
		int n = Integer.parseInt(br.readLine());
		for (int i = 0; i < n; i++) {
			String a = br.readLine();
			bw.append(a.charAt(0)).append(a.charAt(a.length()-1));
			bw.newLine();
		}
		bw.flush();
	}
}