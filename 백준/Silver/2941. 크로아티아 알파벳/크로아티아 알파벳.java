import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 선언
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); // 선언
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		String alph = st.nextToken();
		alph = alph.replaceAll("c=", "1");
		alph = alph.replaceAll("c-", "1");
		alph = alph.replaceAll("dz=", "1");
		alph = alph.replaceAll("d-", "1");
		alph = alph.replaceAll("lj", "1");
		alph = alph.replaceAll("nj", "1");
		alph = alph.replaceAll("s=", "1");
		alph = alph.replaceAll("z=", "1");
		
		bw.write(String.valueOf(alph.length()));
		
		bw.flush();
		bw.close();
	}
}