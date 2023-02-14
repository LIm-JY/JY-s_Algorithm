class Solution {
    public String solution(String cipher, int code) {
        String answer = "";
        String[] splCip = cipher.split(""); 
        int j = code-1;
        for (int i = j; i < splCip.length; i++) {
            if(i == j) {
                answer += splCip[i];
                j += code;
            }
        }
        return answer;
    }
}