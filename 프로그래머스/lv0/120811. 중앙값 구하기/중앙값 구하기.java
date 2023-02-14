import java.util.Arrays;
class Solution {
    public int solution(int[] array) {
        int answer = 0;
        
		Arrays.sort(array);
		int m = array.length / 2;
		answer = array[m];
        return answer;
    }
}