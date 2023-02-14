import java.util.Arrays;
class Solution {
    public int[] solution(String my_string) {
    	String str = null;
    	str = my_string.replaceAll(("[A-z]"), "");
    	String[] splStr = null;
    	splStr = str.split("");
        int[] answer = new int[str.length()];
        for (int i = 0; i < answer.length; i++) {
			answer[i] = Integer.parseInt(splStr[i]);
		}
        Arrays.sort(answer);
        return answer;
    }
}