import java.io.*;
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 선언
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); // 선언
		String str = "";
		while ((str = br.readLine()) != null) {
		    bw.write(str);
		    bw.newLine();
		    bw.flush();
		}
	}
}