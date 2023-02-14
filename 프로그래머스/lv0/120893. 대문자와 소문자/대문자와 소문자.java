class Solution {
    public String solution(String my_string) {
        String answer = "";
        for (int i = 0; i < my_string.length(); i++) {
        	// 1. 대문자일 떄
        	if(my_string.charAt(i)>=65&&my_string.charAt(i)<97) {
        		answer += (char)(my_string.charAt(i)+32);
        	}
        	// 1. 소문자일 떄
        	if(my_string.charAt(i)>=97&&my_string.charAt(i)<129) {
        		answer += (char)(my_string.charAt(i)-32);
        	}
		}
        return answer;
    }
}