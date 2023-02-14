import java.io.*;
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); // 선언
	    bw.write("69");
	    bw.newLine();
	    bw.write("lgrnsdk");
	    bw.flush();
	    bw.close();
	}
}