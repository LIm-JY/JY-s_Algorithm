import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
class Solution {
    public int[] solution(int[][] score) {
        int[] answer = new int [score.length];
        List<Integer> iList = new ArrayList<Integer>();
        for (int i = 0; i < score.length; i++) {
			iList.add(score[i][0] + score[i][1]); 
		}
        
        
        iList.sort(Comparator.reverseOrder());
        System.out.println(iList);
        for (int i = 0; i < score.length; i++) {
            answer[i] = iList.indexOf(score[i][0] + score[i][1]) + 1;
        }
        return answer;
    }
}