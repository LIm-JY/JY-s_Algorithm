class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = {}; // 정답
        int[] rev_num_list = new int[num_list.length]; // 역순배열을 담을 배열
        int cnt = 0; // 카운트
        // num_list.length-1 까지 i--하는 포문을 돌려준다.
        for (int i = num_list.length-1; i >= 0; i--) {
        	rev_num_list[cnt] = num_list[i]; // num_list에 담아준다.
        	cnt++;
		}
        answer = rev_num_list;
        return answer;
    }
}