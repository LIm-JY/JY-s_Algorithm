class Solution {
    public int solution(int n) {
        int answer = n;
        int i = 1;
        //  반복
        while(i <= answer){
        	// 3이 들어가지 않으며, 3의 배수 또한 아닌 경우까지
        	if(String.valueOf(i).contains("3")|| i%3 == 0) {
        		answer++;
        	}
        	i++;
        }
        return answer;
    }
}