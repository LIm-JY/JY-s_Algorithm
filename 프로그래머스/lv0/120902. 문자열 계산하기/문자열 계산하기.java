class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String[] spl = my_string.split(" ");
        answer = Integer.parseInt(spl[0]);
        for (int i = 0; i < spl.length; i++) {
			if("+".equals(spl[i])) {
				answer += Integer.parseInt(spl[i+1]);
			}
			if("-".equals(spl[i])) {
				answer -= Integer.parseInt(spl[i+1]);
			}
		}
        return answer;
    }
}