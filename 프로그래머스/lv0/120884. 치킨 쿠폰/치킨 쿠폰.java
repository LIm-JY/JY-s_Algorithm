class Solution {
    public int solution(int chicken) {
        int answer = 0;
        int service = chicken/10;
        int plusChicken = service + chicken % 10;
        
        while (true) {
			answer += service;
			if (plusChicken < 10) {
				break;
			}
			service = plusChicken / 10;
			plusChicken = service + plusChicken % 10;
		}
        return answer;
    }
}