class Solution {
    public String solution(String letter) {
        String answer = "";
        String[] mosLets = letter.split(" ");
        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        for (int i = 0; i < mosLets.length; i++) {
        	for (int j = 0; j < morse.length; j++) {
        		if(morse[j].equals(mosLets[i])){
        			answer += (char)(j+97);
        		}
			}
		}
        return answer;
    }
}