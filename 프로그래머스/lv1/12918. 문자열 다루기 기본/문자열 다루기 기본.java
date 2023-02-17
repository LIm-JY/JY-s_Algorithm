class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        // s를 replace "" 해서 길이가 다르면 false하도록
        if (s.length() == 4||s.length() == 6 &&(s.length()>0&&s.length()<9)) {
        	String a = s.replaceAll("[A-z]", "");
        	if(a.length() != s.length()) {
        		answer = false;
        	}
		}
        else {
        	answer = false;
        }
        return answer;
    }
}