class Solution {
    public String solution(String my_string) {
        String answer = my_string;
        String[] Consonants = {"a", "e", "i", "o", "u"}; // 모음들
        for (int i = 0; i < Consonants.length; i++) {
        	answer = answer.replaceAll(Consonants[i], "");
		}
        return answer;
    }
}