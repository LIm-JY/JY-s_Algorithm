class Solution {
    public int solution(String A, String B) {
        int answer = 0; // 정답
        String strA = A;  // 스트링A를 담아준다.
        for (int i = 0; i < A.length(); i++) {
        	// strA와 B를 문자열 비교해준다.
            if(strA.equals(B)) {
                return answer;
        	}
        	String a = strA.substring(strA.length()-1); // a에는 strA의 마지막 글자를 넣어준다.
        	strA = a + strA.substring(0, strA.length()-1); // strA에 a+ strA의 마지막 글자-1을 넣어준다.
        	answer++; // 후위연산
		}
        
        return -1; //  몇 번을 밀어도 될 수 없다면 리턴 -1로 한다.
    }
}