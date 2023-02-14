class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int [] answer = {}; // 정답
        int numerator = (numer1 * denom2) + (numer2 * denom1); 
        int denominator = denom1 * denom2;
        int gcdVal = gcd(numerator, denominator);

        answer = new int []{numerator/gcdVal, denominator/gcdVal};
        return answer;
    }
    public static int gcd(int a, int b) {
		if (a%b==0) {
			return b;
		}
    	
    	return gcd(b, a%b);
    }
}