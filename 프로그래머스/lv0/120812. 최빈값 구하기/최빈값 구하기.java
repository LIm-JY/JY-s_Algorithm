class Solution {
    public int solution(int[] array) {
        int answer = 0; // 정답
        int[] index = new int[1001]; // array의 인덱스 카운터
        int max = Integer.MIN_VALUE; // 최대값을 저장하기위한 변수 : 초기값은 정수형의 최소값 지정
        int maxCnt = 0; // max 값의 카운트
        // index[array[i]] 값을 ++해준다.
        for (int i = 0; i < array.length; i++) {
        	index[array[i]]++;
		}
        // 최빈값 구하기
        for(int i=0;i<index.length;i++){
        	if(max<index[i]){
                max = index[i];
            	answer = i;
            }
        }
        // 최빈값이 여러개일 때를 대비해 max와 index[i]의 값이 같을 때 카운트를 ++한다
        for (int i = 0; i < index.length; i++) {
        	if(index[i] == max) {
        		maxCnt++;
        	}
		}
        // 최빈값이 여러개 이면 answer를 -1로 리턴한다.
        if(maxCnt > 1) {
        	answer = -1;
        }
        return answer;
    }
}