import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 선언
		int n = Integer.parseInt(br.readLine());
		int a = 0;
		for (int i = 1; i <= n; i++) {
			a += i;
		}
		System.out.print(a);
	}
}