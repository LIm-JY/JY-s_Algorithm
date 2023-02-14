import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 선언
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); // 선언
		int len = Integer.parseInt(br.readLine());
		StringTokenizer st;
		
		
		for (int i = 0; i < len; i++) {
			double avg = 0.0d; // 평균 값
			st = new StringTokenizer(br.readLine(), " ");
			int scoreLen = Integer.parseInt(st.nextToken()); // 학생 수
			int[] score = new int[scoreLen];
			
			for (int j = 0; j < scoreLen; j++) {
				score[j] = Integer.parseInt(st.nextToken());
				avg += score[j];
			}
			double cnt = 0;
			avg = avg/scoreLen; // 평균 값 완료
			// 평균 값 비교 후 큰 카운트 세기
			for (int j = 0; j < scoreLen; j++) {
				if(score[j] > avg) {
					cnt++;
				}
			}
			bw.write(String.format("%.3f%%", ((cnt/scoreLen)*100)));
			bw.newLine();
		}
		
		bw.flush(); // 남아있는 데이터 모두 출력
	}
}