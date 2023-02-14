import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 선언
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); // 선언
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		String[] fst = st.nextToken().split("");
		String[] sec = st.nextToken().split("");
		StringBuilder sbFst = new StringBuilder();
		StringBuilder sbSec = new StringBuilder();
		for (int i = fst.length-1; i >= 0; i--) {
			sbFst.append(fst[i]);
		}
		for (int i = sec.length-1; i >= 0; i--) {
			sbSec.append(sec[i]);
		}
		// 첫번 째가 두번 째 보다 클 때
		if(Integer.parseInt(sbFst.toString()) > Integer.parseInt(sbSec.toString())) {
			bw.write(sbFst.toString());
		}else {
			bw.write(sbSec.toString());
		}
		bw.flush();
		bw.close();
	}
}