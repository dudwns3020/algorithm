class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = {};
        
        int sum = brown + yellow;
        
        for(int i = sum; i > 0; i--) {
            int len = i;
            int wid = sum / len;
            
            if(sum % i == 0) {
                if(len >= wid)  {
                    if (len + wid - 2 == brown / 2) {
                        answer = new int[2];
                        answer[0] = len;
                        answer[1] = wid;
                    }
                }
             }            
        }
        
        return answer;
    }
}