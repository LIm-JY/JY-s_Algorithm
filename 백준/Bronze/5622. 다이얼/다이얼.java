import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 선언
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); // 선언
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		String[] splStrArr = st.nextToken().split("");
		
		int sum = 0;
		for (String alph : splStrArr) {
        	sum += 2; // for문 초기화 될 때마다 2를 더해줌
        	// case에 break를 걸지 않아서 sum++
			switch (alph) {
            	case "W": case "X": case "Y": case "Z":
            		sum ++;
            	case "T": case "U": case "V":
            		sum ++;
            	case "P": case "Q": case "R": case "S":
            		sum ++;
            	case "M": case "N": case "O":
            		sum ++;
            	case "J": case "K": case "L":
            		sum ++;
            	case "G": case "H": case "I":
            		sum ++;
            	case "D": case "E": case "F":
            		sum ++;
            	case "A": case "B": case "C":
            		sum ++;
            	default:
            		break;
        	}	
		
		}
		bw.write(String.valueOf(sum));
		
		bw.flush();
		bw.close();
	}
}