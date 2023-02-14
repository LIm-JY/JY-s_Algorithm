import java.util.ArrayList;
import java.util.List;
class Solution {
    public List<Integer> solution(int n) {
        List<Integer> answer = new ArrayList<Integer>();
        if(1<=n&&n<=100) {
        	for (int i = 1; i <= n; i++) {
        		if(i%2==1) {
        			answer.add(i);
        		}
        	}
        }
        return answer;
    }
}