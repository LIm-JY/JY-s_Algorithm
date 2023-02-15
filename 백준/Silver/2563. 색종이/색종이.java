import java.io.*;
import java.util.*;
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 선언
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); // 선언
		int colpapLen = Integer.parseInt(br.readLine()); // 색종이 개수
		int[][] paper = new int [101][101]; // 도화지
		int cnt = 0;
		for (int i = 0; i < colpapLen; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			// 가로, 세로의 크기가 각각 10인 정사각형 모양의 검은색 색종이라 길이에 +10을해준다.
			for (int j = a; j < a+10; j++) {
				// 가로, 세로의 크기가 각각 10인 정사각형 모양의 검은색 색종이라 길이에 +10을해준다.
				for (int j2 = b; j2 < b+10; j2++) {
                    // 0일 때 카운트 ++
					if (paper[j][j2] == 0) {
                    	paper[j][j2]++;
                    	cnt++;
                    }
				}
			}
		}
		bw.write(Integer.toString(cnt));
		bw.flush();
	}
}