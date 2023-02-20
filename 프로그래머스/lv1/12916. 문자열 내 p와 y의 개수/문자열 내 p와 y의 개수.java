class Solution {
    boolean solution(String s) {
        boolean answer = true;
        String p = s.replaceAll("[p|P]", "");
        String y = s.replaceAll("[y|Y]", "");
        if (s.length()-p.length() != s.length()-y.length()) {
			answer = false;
		}
        return answer;
    }
}