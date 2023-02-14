import java.util.Arrays;
class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        Arrays.sort(sides); // 오름차순 정렬
        int longSide = sides[2]; // 큰변
        int midSide = sides[1]; // 중간변
        int smlSide = sides[0]; // 작은변
        
        if(longSide>=(midSide+smlSide)) {
        	answer = 2;
        }else {
        	answer = 1;
        }
        return answer;
    }
}