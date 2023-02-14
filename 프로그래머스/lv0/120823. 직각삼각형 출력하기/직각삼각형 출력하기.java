import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for (int i = 0; i < n; i++) {
			// j는 i와 같거나 작으니 n번째 마다 개수가 늘어난다
        	for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
    }
}