class Solution {
    public String solution(int age) {
        String answer = "";
        String a = String.valueOf(age);
        String[] splAge  = a.split("");
        for (int i = 0; i < splAge.length; i++) {
        	answer += (char)((Integer.parseInt(splAge[i]) + 97));
		}
        return answer;
    }
}