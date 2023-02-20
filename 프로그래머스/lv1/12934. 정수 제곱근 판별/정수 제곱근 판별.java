class Solution {
    public long solution(long n) {
        long answer = 0;
        Double sqrt = Math.sqrt(n);
        if(sqrt == sqrt.intValue()){
        	answer = (long)((Math.sqrt(n)+1)*(Math.sqrt(n)+1));
        }else {
        	answer = -1;
        }
        return answer;
    }
}