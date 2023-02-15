import java.io.*;
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 선언
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); // 선언
		// StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		long A = Long.parseLong(br.readLine());
		long B = Long.parseLong(br.readLine());
		long C = Long.parseLong(br.readLine());
		String[] res = Long.toString((A*B*C)).split("");
		int[] arr = new int[10];
		for (int i = 0; i < res.length; i++) {
			int a = Integer.parseInt(res[i]);
			arr[a]++;
		}
		for (int i = 0; i < arr.length; i++) {
			bw.write(Integer.toString(arr[i]));
			bw.newLine();
		}
		bw.flush();
	}
}