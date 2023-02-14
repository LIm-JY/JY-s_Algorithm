class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        if (slope(dots[0], dots[1]) == slope(dots[2], dots[3])) {
            return 1;
        }
        if (slope(dots[0], dots[2]) == slope(dots[1], dots[3])) {
        	return 1;
        }
        if (slope(dots[0], dots[3]) == slope(dots[2], dots[1])) {
        	return 1;
        }
        
        return answer;
    }
    
    public static double slope(int[] dot1, int[] dot2) {
		
    	// 기울기 구하는 공식 : (y2 - y1) / (x2 - x1)
    	return (double)(dot2[1]-dot1[1])/(dot2[0]-dot1[0]);
    }
}