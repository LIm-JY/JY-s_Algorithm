class Solution {
    public int solution(int n, int t) {
        int answer = n;
        // 시간만큼의 for문을 돌린다.
        for (int i = 0; i < t; i++) {
        	answer *= 2; // for문을 이용하여 시간만큼 2를 곱해준다. == answer = answer * 2;
		}
        return answer;
    }
}