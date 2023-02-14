class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        int nSum = num * (1 + num) / 2;
        for(int i = 0; i < num; i++){
            answer[i] = (i+1) + (total - nSum) / num;
        }
        return answer;
    }
}