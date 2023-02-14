class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String[] splMyStr = my_string.split("");
        // 한자리 자연수이므로 10까지로 제한
        for (int i = 0; i < 10; i++) {
        	// 스플릿한 splMyStr의 길이만큼 for
        	for (int j = 0; j < splMyStr.length; j++) {
				// i는 int이므로 ""+i를 해주어 i를 string으로 변환
        		if((""+i).equals(splMyStr[j])) {
					answer += Integer.parseInt(splMyStr[j]);
				}
			}
		}
        return answer;
    }
}