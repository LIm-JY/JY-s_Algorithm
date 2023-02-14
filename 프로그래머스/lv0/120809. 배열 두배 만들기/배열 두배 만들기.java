class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length]; // 정답
        if(1 <= numbers.length && numbers.length <= 1000) {
        	for(int i = 0; i < numbers.length; i++) {
        		if(-10000 <= numbers[i] && numbers[i] <= 10000) {
        			answer[i] = numbers[i] * 2;
        		}
        	}
        }
        return answer;
    }
}