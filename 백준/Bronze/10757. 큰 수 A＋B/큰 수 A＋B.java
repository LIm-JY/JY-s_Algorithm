import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 선언
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); // 선언
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		BigInteger A = new BigInteger(st.nextToken());
		BigInteger B = new BigInteger(st.nextToken());
		BigInteger sum = A.add(B);
		bw.write(String.valueOf(sum));
		
		bw.flush();
		bw.close();
	}
}