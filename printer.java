class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        
        for(int i = 0; i < priorities.length; i++) {
            if(priorities[0] <= priorities[i]) {
                shift(priorities);
                location -= 1;
                if(location < 0) {
                    location = priorities.length - 1;
                }
            }
            else {
                break;
            }
        }
        
        answer = location + 1;
        
        return answer;
    }
    
    void shift(int[] a) {
        int temp = a[0];
        for(int i = 0; i < a.length - 1; i++) {
            a[i] = a[i+1];
        }
        a[a.length - 1] = temp;
    }
}