class Solution {
    public int solution(int n) {
        int answer = 0;
        int mul = 1;
        for (int i = 1; i <= 10; i++) {
        	mul *= i;
        	if(n>=mul) {
        		answer = i;
        	}
		}
        return answer;
    }
}