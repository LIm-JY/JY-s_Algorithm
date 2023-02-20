class Solution {
    public String solution(String phone_number) {
        String answer = "";
        String[] arr = phone_number.split("");
        for (int i = phone_number.length()-1; i >= 0; i--) {
        	if(i < phone_number.length()-4) {
        		arr[i] = "*";
        	}
		}
        for (int i = 0; i < arr.length; i++) {
			answer += arr[i];
		}
        return answer;
    }
}