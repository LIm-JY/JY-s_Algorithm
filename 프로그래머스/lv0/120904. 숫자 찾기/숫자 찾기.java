class Solution {
    public int solution(int num, int k) {
        int answer = -1;
        String[] splStrNum = Integer.toString(num).split("");
        for (int i = 0; i < splStrNum.length; i++) {
			if(Integer.toString(k).equals(splStrNum[i])) {
				return i+1;
			}
		}
        return answer;
    }
}