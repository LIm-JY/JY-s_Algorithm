class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String[] splStr = my_string.split("[A-z]");
		for (int i = 0; i < splStr.length; i++) {
			if(!splStr[i].isEmpty()) {
				answer += Integer.parseInt(splStr[i]);
			}else {
				answer += 0;
			}
		}
        return answer;
    }
}