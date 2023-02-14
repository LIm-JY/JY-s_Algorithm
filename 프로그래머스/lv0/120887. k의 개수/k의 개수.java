class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        String a = null;
        for (int l = i; l <= j; l++) {
        	a += Integer.valueOf(l).toString();
		}
        String[] arr = a.split("");
        for (int m = 0; m < arr.length; m++) {
        	if(arr[m].equals(Integer.valueOf(k).toString())) {
        		answer++;
        	}
		}
        return answer;
    }
}