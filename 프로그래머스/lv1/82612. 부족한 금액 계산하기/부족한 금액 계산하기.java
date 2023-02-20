class Solution {
    public long solution(int price, int money, int count) {
        long answer = money;
        for (int i = 1; i <= count; i++) {
        	answer -= i*price;
		}
        answer = answer > 0 ? 0 : Math.abs(answer);  
        return answer;
    }
}