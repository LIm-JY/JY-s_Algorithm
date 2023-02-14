class Solution {
    public int solution(int[] box, int n) {        int answer = 0;
        //box[0] = 상자의 가로 길이
        //box[1] = 상자의 세로 길이
        //box[2] = 상자의 높이 길이
        answer = (box[0]/n) * (box[1]/n) * (box[2]/n);
        return answer;
    }
}