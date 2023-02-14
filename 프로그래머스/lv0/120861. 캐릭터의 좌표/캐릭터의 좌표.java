class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = new int [2];
    	int firLength = board[1]/2;
    	int secLength = board[0]/2;
        for (int i = 0; i < keyinput.length; i++) {
        	
        	// 1-1. 위
        	if("up".equals(keyinput[i]) && answer[1]+1 <= firLength){
        		answer[1]++;
			}
        	// 1-2. 아래
			if("down".equals(keyinput[i]) && answer[1]-1 >= -(firLength)){
				answer[1]--;
			}
			// 2-1. 오른쪽
			if("right".equals(keyinput[i]) && answer[0]+1 <= (secLength)){
				answer[0]++;
			}
			// 2-2. 왼쪽
			if("left".equals(keyinput[i]) && answer[0]-1 >= -(secLength)){
				answer[0]--;
			}
        	
		}
        return answer;
    }
}