class Solution {
    public int solution(int n) {
        int answer = 0;
        String splN = n+"";
        for (int i = 0; i < splN.toCharArray().length; i++) {
        	answer += splN.charAt(i)-'0';
		}
        return answer;
    }
}