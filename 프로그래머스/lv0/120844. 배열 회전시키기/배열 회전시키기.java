class Solution {
    public int[] solution(int[] numbers, String direction) {
        int[] answer = new int[numbers.length];
    	// 1. 오른쪽일 때
        if ("right".equals(direction)) {
    		answer[0] = numbers[numbers.length-1];
            for (int i = 1; i < numbers.length; i++) {
    			answer[i] = numbers[i-1];
    		}
    	}
        // 2. 왼쪽일 때
    	if ("left".equals(direction)) {
    		answer[numbers.length-1] = numbers[0];
            for (int i = 1; i < numbers.length; i++) {
    			answer[i-1] = numbers[i];
    		}
    	}
        return answer;
    }
}