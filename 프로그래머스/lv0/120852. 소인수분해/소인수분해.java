import java.util.LinkedHashSet;
class Solution {
    public int[] solution(int n) {
        int[] answer = {};
        LinkedHashSet<Integer> set = new LinkedHashSet<>(); // LinkedHashSet은 순서를 관리하고 중복값 허용을 안한다.
        for (int i = 2; i <= n; i++) {
			while (n%i == 0) {
				set.add(i);
				n = n/i;
			}
		}
        answer = set.stream().mapToInt(Integer::intValue).sorted().toArray();
        return answer;
    }
}