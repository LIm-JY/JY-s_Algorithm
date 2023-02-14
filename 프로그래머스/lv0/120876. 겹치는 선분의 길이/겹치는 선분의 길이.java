class Solution {
    public int solution(int[][] lines) {
    	int answer = 0;
    	// 1. arr 배열 및 변수 초기화
        int arr[] = new int[200]; // 길이가 -100~100사이 임
        
        
        // 2. lines 정보를 arr배열에 적용
        for (int i = 0; i < lines.length; i++) {
        	int startCom = lines[i][0] + 100; // 시작 점
        	int endCom   = lines[i][1] + 100; // 끝 점
        	// 배열의 j번째를 ++해준다.
        	for (int j = startCom; j < endCom; j++) {
				arr[j]++;
			}
		}
        // 3. arr 배열에서 겹친구분 세기
        for (int i = 0; i < 200; i++) {
			// 겹치는 부분이 있다면 arr[i]가 1 이상이 나온다. 
        	if(arr[i] > 1) {
				answer++; // 겹치는 부분만큼 answer를 ++해준다.
			}
		}
        
        return answer;
    }
}