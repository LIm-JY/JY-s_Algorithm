class Solution {
    public int solution(int angle) {
        int answer = 0;
        // 1. 예각
        if(0 < angle && angle < 90) {
        	answer = 1;
        }
        // 2. 직각
        if(angle == 90) {
        	answer = 2;
        }
        // 3. 둔각
        if(90 < angle && angle < 180) {
        	answer = 3;
        }
        // 4. 평각
        if(angle == 180) {
        	answer = 4;
        }
        return answer;
    }
}