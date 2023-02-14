class Solution {
    public String solution(String my_string, int num1, int num2) {
        String answer = "";
        String[] splStr = my_string.split(""); // 공백을 나누어줌
        String str1 = splStr[num1]; // 문자1
        String str2 = splStr[num2]; // 문자2
		splStr[num2] = str1; // 문자를 바꾼다.
		splStr[num1] = str2; // 문자를 바꾼다
		for (int i = 0; i < splStr.length; i++) {
			answer += splStr[i];
		}
        return answer;
    }
}