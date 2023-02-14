class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        for (int i = 0; i <= numbers.length-1; i++) {
			for (int j = 0; j <= numbers.length-1; j++) {
				if(i!=j && numbers[i]*numbers[j]>answer) {
					answer = numbers[i]*numbers[j];
				}
			}
		}
        return answer;
    }
}