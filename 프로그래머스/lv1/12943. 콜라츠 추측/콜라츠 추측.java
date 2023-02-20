class Solution {
    public int solution(int num) {
        int answer = 0;
        long sum = num;
        for (int i = 1; i <= 500; i++) {
        	if(sum == 1) {
        		break;
        	}
        	if(sum%2==0) {
        		sum = sum/2;
        		answer++;
        	}else {
        		sum = (sum*3)+1;
        		answer++;
        	}
			
		}
        if (sum!=1) {
			answer = -1;
		}
        return answer;
    }
}