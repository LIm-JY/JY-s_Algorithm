class Solution {
    public String solution(String my_string) {
        String answer = "";
        String[] splStr = my_string.split("");
        // 문자열의 길이-1 부터 0까지 for문을 돌린다
        for (int i = splStr.length-1; i >=0; i--) {
        	// answer에 my_string을 역순으로 substring을 해준다.
        	answer += splStr[i];
		}
        return answer;
    }
}