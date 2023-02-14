class Solution {
    public int solution(int a, int b) {
        int newB = b / gcd(a, b);

        while (newB != 1) {
            if (newB % 2 == 0) {
                newB /= 2;
            } else if (newB % 5 == 0) {
                newB /= 5;
            } else {
                return 2;
            }
        }

        return 1;
    }
    // 유클리드 알고리즘을 이용한 최대공약수 구하기
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }
}