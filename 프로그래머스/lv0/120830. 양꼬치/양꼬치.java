class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        int sheepPay = 12000; // 양꼬치가격
        int drinkPay = 2000;  // 음료가격
        // 1. 서비스 전 가격 = 양꼬치가격*양꼬치 개수 + 음료가격*음료개수
        answer = sheepPay*n+drinkPay*k;
		// 2. 서비스 후 가격 = n이 10보다 크거나 같으면 n을 나눈 값에 음료가격을 곱한가격을 뺸다.
        if(n>=10){
			answer = answer - n/10*drinkPay;
		}
        return answer;
    }
}