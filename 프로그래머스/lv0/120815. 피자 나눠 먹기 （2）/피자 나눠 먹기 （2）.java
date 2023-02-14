class Solution {
    public int solution(int n) {

        int answer = 1; // 정답
        int pizzaBox = 6; // 박스안에 담긴 피자수
        
        while (true) {
			if(answer*pizzaBox%n==0) {
				break;
			}
			answer++;
		}
        System.out.println(answer);
        
        return answer;
    
    }
}