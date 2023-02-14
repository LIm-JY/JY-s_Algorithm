class Solution {
    public String[] solution(String my_str, int n) {
        String[] answer = new String[(my_str.length()+n-1)/n];
        for (int i = 0; i < answer.length; i++) {
        	int s = n*i; // 시작
        	int e = 0;   // 끝
        	if (s+n >= my_str.length()) {
				e = my_str.length(); // length를 초과하면 안됨
			}else {
				e = s + n; // 나머지는 알바 아님
			}
    		answer[i] = my_str.substring(s, e); // 문자열 자르기
    		
		}
        return answer;
    }
}