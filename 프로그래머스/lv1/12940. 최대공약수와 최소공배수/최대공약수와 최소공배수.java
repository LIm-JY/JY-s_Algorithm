class Solution {
    public static int[] solution(int n, int m) {
    	int[] answer = new int[2];
    	int max = Math.max(n, m);
    	int min = Math.min(n, m);
    	answer[0] = gcd(max,min);
    	answer[1] = max*min/answer[0];
    	
        return answer;
    }
    // 최대공약수 구하는 함수 (유클리드 호제법)
    static int gcd(int a, int b) {
        if(a % b == 0) {
            return b;
        }
        return gcd(b, a%b);
    }
}