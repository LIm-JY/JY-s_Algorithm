class Solution {
    public int solution(String s) {
        int answer = 0;
        String[] spl = s.split(" ");
        for (int i = 0; i < spl.length; i++) {
			if(("Z").equals(spl[i])) {
				answer -= Integer.valueOf(spl[i-1]); // Z일 때 뺴준다
				continue;
			}
			answer += Integer.valueOf(spl[i]);
		}
        return answer;
    }
}