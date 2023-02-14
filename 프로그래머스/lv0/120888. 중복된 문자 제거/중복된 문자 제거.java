class Solution {
    public String solution(String my_string) {
        String answer = "";
        String[] splMyStrs = my_string.split("");
    	for (int i = 0; i < splMyStrs.length; i++) {
			if(my_string.indexOf(splMyStrs[i])==i) {
				answer += my_string.charAt(i);
			}
		}
        return answer;
    }
}