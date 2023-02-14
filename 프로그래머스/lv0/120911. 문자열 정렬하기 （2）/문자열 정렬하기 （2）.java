import java.util.Arrays;
class Solution {
    public String solution(String my_string) {
        String answer = "";
        String[] splStr = my_string.toLowerCase().split("");
        Arrays.sort(splStr);
        for (String string : splStr) {
        	answer += string;
		}
        return answer;
    }
}