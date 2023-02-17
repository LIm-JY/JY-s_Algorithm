import java.util.*;
class Solution {
    public int[] solution(int[] arr, int divisor) {
        List<String> list = new ArrayList<String>();
        for (int i = 0; i < arr.length; i++) {
        	if (arr[i]%divisor==0) {
        		list.add(String.valueOf(arr[i]));
			}
		}
    	int[] answer = new int[list.size()];
        if (list.size() == 0) {
        	answer = new int[1];
        	answer[0] = -1;
        }
        else {
        	for (int i = 0; i < answer.length; i++) {
				answer[i] = Integer.parseInt(list.get(i));
			}
            Arrays.sort(answer);
        }
        return answer;
    }
}