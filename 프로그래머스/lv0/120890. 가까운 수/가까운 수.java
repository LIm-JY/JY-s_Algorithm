import java.util.Arrays;
class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        int val = Integer.MAX_VALUE;
        Arrays.sort(array);
        for (int i = 0; i < array.length; i++) {
        	if(val > Math.abs(array[i]-n)) {
        		val =  Math.abs(array[i]-n);
        		answer = array[i];
			}
		}
        return answer;
    }
}