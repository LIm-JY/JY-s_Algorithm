class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        //  "aya", "ye", "woo", "ma"
        for (int i = 0; i < babbling.length; i++) {
            babbling[i] = babbling[i].replaceAll("aya|ye|woo|ma", "1");
			babbling[i] = babbling[i].replaceAll("1", "");
			if("".equals(babbling[i])){
				answer++;
			}
		}
        
        return answer;
    }
}