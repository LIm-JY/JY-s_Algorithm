class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        for (int i = 0; i < quiz.length; i++) {
        	String[] spl = quiz[i].split(" ");
        	int a = Integer.parseInt(spl[0]); // 연산 앞 자리
        	int b = Integer.parseInt(spl[2]); // 연산 뒷 자리
        	int c = Integer.parseInt(spl[4]); // 연산 후 결과
			// 1. 더하기일 때
        	if("+".equals(spl[1])) {
                if (a + b == c) {
                    answer[i] = "O";
                } else {
                    answer[i] = "X";
                }
			}
        	// 2. 빼기일 때
			else if("-".equals(spl[1])) {
				if (a - b == c) {
                    answer[i] = "O";
                } else {
                    answer[i] = "X";
                }
			}
		}
        return answer;
    }
}