class Solution {
    public int solution(int hp) {
        int answer = 0;
        int genAnt = 5; // 장군개미
        int solAnt = 3; // 병정개미
        int worAnt = 1; // 일꾼개미
        
        answer = hp/genAnt;
        if(hp%genAnt!=0) {
        	answer += hp%genAnt/solAnt;
        }
        if(hp%genAnt%solAnt!=0) {
        	answer += hp%genAnt%solAnt/worAnt;
        }
        return answer;
    }
}