class Solution {
    public int solution(int[] array) {
        int answer = 0; // 정답
        
        // 1. array를 for를 이용해 풀어준다.
        for(int i = 0; i < array.length; i ++){
        	String l1 =  Integer.toString(array[i]); // 스트링에 array 배열을 형변환하여 담아준다.
        	String[] arr = l1.split(""); // l1을 ""로 스플릿한 값을 arr에 담아준다.
        	// 2. arr의 길이만큼 for문을 돌린다.
            for (int j=0; j<arr.length; j++) {
        		// 3. 7이 arr의 j번째 값과 같으면
                if("7".equals(arr[j])) {
        			// 4. answer를 후위연산으로 ++해준다.
                    answer++;
        		}
        	}
        }
        return answer;
    }
}