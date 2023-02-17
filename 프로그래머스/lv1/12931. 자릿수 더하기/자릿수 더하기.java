import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        String[] a = Integer.toString(n).split("");
        for (int i = 0; i < a.length; i++) {
			answer += Integer.parseInt(a[i]);
		}
        return answer;
    }
}