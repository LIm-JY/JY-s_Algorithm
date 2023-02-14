import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 선언
		int x = Integer.parseInt(br.readLine());
		int y = Integer.parseInt(br.readLine());
		int answer = 0;
        // 1. x가 양수일 때
        if(x>0) {
    	// 1-1 y가 양수일 때
        answer = 1;
        	// 1-2 y가 음수일 때
        	if(y<0) {
        		answer = 4;
            }
        }
        // 2. x가 음수일 때
        if(x<0) {
    	// 2-1 y가 양수일 때
        answer = 2;
        	// 2-2 y가 음수일 때
        	if(y<0) {
        		answer = 3;
            }
        }
		System.out.println(answer);
	}
}