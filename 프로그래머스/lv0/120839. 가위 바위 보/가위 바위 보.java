class Solution {
    public String solution(String rsp) {
        String answer = "";
        String[] splRsp = rsp.split(""); // ""로 스플릿 한 것을 담아준다.
        for (int i = 0; i < splRsp.length; i++) {
			// 1. 바위일 때
        	if("0".equals(splRsp[i])) {
				answer += "5";
			}
        	// 2. 가위일 때
			if("2".equals(splRsp[i])) {
				answer += "0";
			}
			// 3. 보일 때
			if("5".equals(splRsp[i])) {
				answer += "2";
			}
		}
        return answer;
    }
}