import java.io.*;
import java.util.*;
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 선언
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); // 선언
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		// A+: 4.3, A0: 4.0, A-: 3.7
		// B+: 3.3, B0: 3.0, B-: 2.7
		// C+: 2.3, C0: 2.0, C-: 1.7
		// D+: 1.3, D0: 1.0, D-: 0.7
	    String[] arr = st.nextToken().split("");
	    String s;
	    if("A".equals(arr[0])){
	    	if ("+".equals(arr[1])) {
				s = "4.3";
			}
	    	else if ("0".equals(arr[1])) {
	    		s = "4.0";
			}
	    	else {
	    		s = "3.7";
			}
	    }
	    else if("B".equals(arr[0])){
	    	if ("+".equals(arr[1])) {
				s = "3.3";
			}
	    	else if ("0".equals(arr[1])) {
	    		s = "3.0";
			}
	    	else {
	    		s = "2.7";
			}
	    }
	    else if("C".equals(arr[0])){
	    	if ("+".equals(arr[1])) {
				s = "2.3";
			}
	    	else if ("0".equals(arr[1])) {
	    		s = "2.0";
			}
	    	else {
	    		s = "1.7";
			}
	    }
	    else if("D".equals(arr[0])){
	    	if ("+".equals(arr[1])) {
				s = "1.3";
			}
	    	else if ("0".equals(arr[1])) {
	    		s = "1.0";
			}
	    	else {
	    		s = "0.7";
			}
	    }
	    else {
	    	s = "0.0";
	    }
	    bw.write(s);
	    bw.flush();
	}
}