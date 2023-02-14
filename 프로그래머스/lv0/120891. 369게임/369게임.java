class Solution {
    public int solution(int order) {
        int answer = 0;
        String[] splStrOrders = String.valueOf(order).split("");
        for (int i = 0; i < splStrOrders.length; i++) {
			if (Integer.parseInt(splStrOrders[i]) != 0 &&Integer.parseInt(splStrOrders[i])%3==0) {
				answer++;
			}
		}
        return answer;
    }
}