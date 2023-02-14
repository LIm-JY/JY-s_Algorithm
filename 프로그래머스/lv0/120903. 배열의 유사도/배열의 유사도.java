class Solution {
    public int solution(String[] s1, String[] s2) {
        int answer = 0;
        for (int i = 0; i < s1.length; i++) {
			for (int j = 0; j < s2.length; j++) {
				// 동일한 원소가 있을 때
                if(s1[i].equals(s2[j])){
					answer++; // 개수 ++
				}
			}
		}
        return answer;
    }
}