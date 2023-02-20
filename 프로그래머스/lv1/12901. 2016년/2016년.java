class Solution {
    public String solution(int a, int b) {
        String answer = "";
        String[] day = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"}; // 요일 1월 1일은 금요일로 시작하므로
        int[] date = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};    // 날짜
        int allDt = b-1;
        for (int i = 0; i < a-1; i++) {
			allDt += date[i];
		}
        answer = day[allDt%7];
        return answer;
    }
}