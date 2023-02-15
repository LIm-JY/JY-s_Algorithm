import java.io.*;
import java.util.*;
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 선언
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); // 선언
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
	    char[] arr = st.nextToken().toCharArray();
	    for (int i = 0; i < arr.length; i++) {
	    	if(arr[i] > 96) {
				arr[i] -= 32;
			}else {
				arr[i] += 32;
			}
	    	bw.write(arr[i]);
		}
	    bw.flush();
	}
}