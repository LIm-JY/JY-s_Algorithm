class Solution {
    public int solution(int slice, int n) {
        int pizza = 0; // 피자개수
        int answer = 0; // 정답
        
        for (int i = 0; i < 100; i++) {
        	pizza = slice*i;
        	if(pizza>=n) {
        		break;
        	}
        	answer++;
		}
        return answer;
    }
}