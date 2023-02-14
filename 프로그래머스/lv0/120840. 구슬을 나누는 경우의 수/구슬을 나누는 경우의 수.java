class Solution {
    public int solution(int balls, int share) {
                int answer = 0;
        double a = 1;
        double b = 1;
        double c = 1;
        double d;
        if(balls<share) {
        	return 1;
        }
        for (int i = 1; i <= balls; i++) {
			a *= i;
		}
        for (int i = 1; i <= balls-share; i++) {
        	b *= i;
        }
        for (int i = 1; i <= share; i++) {
        	c *= i;
        }

    	d = Math.round(a/(b*c));
    	answer = (int)d;
        return answer;
    }
}