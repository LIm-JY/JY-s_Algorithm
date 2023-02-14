class Solution {
    public int solution(int[] common) {
        int answer = 0;       // 정답
        int com  = common[0]; // common 0번 째 값
        int com1 = common[1]; // common 1번 째 값
        int com2 = common[2]; // common 2번 째 값
        // 1. 등차수열일 때 com1-com과 com2-com1은 같다.
        if(com1-com == com2-com1) {
        	answer = common[common.length-1]+(com1-com); // 인덱스는 0부터 시작하여 길이-1한 값에 넣어준다.
        }
        // 2. 등비수열일 때 제한사항에 등차수열 혹은 등비수열이 아닌경우는 없다고 나와있어 else를 씀
        else {
        	answer = common[common.length-1]*(com1/com); // 인덱스는 0부터 시작하여 길이-1한 값에 넣어준다.
        }
        return answer;
    }
}