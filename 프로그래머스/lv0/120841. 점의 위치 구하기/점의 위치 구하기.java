class Solution {
    public int solution(int[] dot) {
        int answer = 0;
        int x = dot[0];
        int y = dot[1];
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
        return answer;
    }
}