class Solution {
    public String solution(String polynomial) {
        String answer = "";
        String[] arr = polynomial.split(" +");
        int xCnt = 0;
        int intCnt = 0;
        
        // 1. 원소 담기
        for (int i = 0; i < arr.length; i++) {
        	// 1-1. x가 원소일 때 원소를 ++해준다.
			if (arr[i].equals("x")) {
				xCnt++;
			}
			// 1-2. x가 포함될 때 x를 제외한 원소의 숫자를 ++해준다.
			else if(arr[i].contains("x")) {
				// 0번 째 부터 길이의 -1까지
				xCnt += Integer.parseInt(arr[i].substring(0, arr[i].length() - 1));
			}
			// 1-3. 나머지들
			else if(!arr[i].equals("+")) {
				intCnt += Integer.parseInt(arr[i]);
			}
		}
        // 2. 숫자만 있는 경우
        if (xCnt == 0 && intCnt != 0) {		//숫자만 있는경우
            answer += intCnt;
        }
        
        // 3. x항만 있는 경우
        if (xCnt != 0 && intCnt == 0) {	
            // 3-1. 1개있을 때
        	if (xCnt == 1) {
                answer += "x";
            } 
        	// 3-2 여러개 있을 때
        	else {
                answer += xCnt + "x";
            }
        }
        // 4. 둘다 있는 경우
        if (xCnt != 0 && intCnt != 0) {
            // 4-1. x가 1개있을 때
        	if (xCnt == 1) {
                answer += "x" + " + " + intCnt;
            } 
        	// 4-2 x가 여러개 있을 때
        	else {
                answer += xCnt + "x" + " + " + intCnt;
            }
        }
        return answer;
    }
}