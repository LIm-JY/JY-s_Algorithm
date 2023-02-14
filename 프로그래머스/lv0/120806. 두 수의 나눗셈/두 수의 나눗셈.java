class Solution {
    public static double solution(double num1, double num2) {
        int answer = 0;
    	double result = 0;
        if(0 <= num1 && num1 <= 100 && 0 <= num2 && num2 <= 100){
    	    double a = num1;  
    	    double b = num2;  
        	result = a / b * 1000;

        }
        answer = (int) result;
        return answer;
    
    }
}