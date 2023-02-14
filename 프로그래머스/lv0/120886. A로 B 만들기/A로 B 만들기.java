import java.util.Arrays;
class Solution {
    public int solution(String before, String after) {
        String[] splBef = before.split("");
        String[] splAft = after.split("");
        Arrays.sort(splBef);
        Arrays.sort(splAft);
        String bf = null;
		String af = null;
        
        for (int i = 0; i < splBef.length; i++) {
        	bf +=splBef[i];
        }
        for (int i = 0; i < splAft.length; i++) {
        	af +=splAft[i];
        }
        if (bf.equals(af)) {
			return 1;
		}else{
			return 0;
		}
    }
}