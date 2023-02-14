class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[2];
        for (int i = 0; i < num_list.length; i++) {
			// 1. 홀일 때
        	if(num_list[i]%2!=0) {
				answer[1]++;
			}
        	// 2. 짝일 때
        	else {
				answer[0]++;
			}
		}
        return answer;

    }
}