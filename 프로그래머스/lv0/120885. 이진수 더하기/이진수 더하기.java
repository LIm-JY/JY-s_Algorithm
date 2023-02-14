class Solution {
    public String solution(String bin1, String bin2) {
    	String answer = "";
        int num1 = Integer.parseInt(bin1, 2); // 2진수로 변환
        int num2 = Integer.parseInt(bin2, 2); // 2진수로 변환
        answer = Integer.toBinaryString(num1+num2);
        
        return answer;
    }
}