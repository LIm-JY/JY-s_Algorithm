import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        if (arr.length == 1) {
			return new int[] {-1};
		}
        List<Integer> list = new ArrayList<Integer>();
        int min = Integer.MAX_VALUE;
        int seq = 0;
        for (int i = 0; i < arr.length; i++) {
			if (arr[i]<min) {
				min = arr[i];
				seq = i;
			}
		}
        for (Integer a : arr) {
        	list.add(a);
		}
        list.remove(seq);
        answer = new int[list.size()];
        for (int i = 0; i < answer.length; i++) {
			answer[i] = list.get(i);
		}
        return answer;
    }
}