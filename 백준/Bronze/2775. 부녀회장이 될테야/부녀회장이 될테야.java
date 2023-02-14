import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 선언
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); // 선언
		// 1. k층의 n호에 살려면 자신의 아래(k-1)층의 1호부터 n호까지 사람들의 수의 합만큼 사람들을 데려와 살아야 한다.
		// 2. 아파트에는 0층부터 있고 각층에는 1호부터 있으며, 0층의 i호에는 i명이 산다.
		
		int[][] apt = new int[15][15]; // 아파트 생서어
		for (int i = 0; i < 15; i++) {
			apt[i][1] = 1; // i층 1호
			apt[0][i] = i; // 0층 i호
		}
		for (int i = 1; i < 15; i++) {
			for (int j = 2; j < 15; j++) {
				apt[i][j] = apt[i][j - 1] + apt[i - 1][j];
			}
		}
		
		int T = Integer.parseInt(br.readLine());	// 테스트데이터 수
		for (int i = 0; i < T; i++) {
			int k = Integer.parseInt(br.readLine()); // 층
			int n = Integer.parseInt(br.readLine()); // 호
			bw.write(String.valueOf(apt[k][n]));
			bw.newLine();
		}
		bw.flush();
		bw.close();
	}
}