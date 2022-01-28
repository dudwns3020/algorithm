import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        int[] answer = {};
        
        int[] s1 = {1, 2, 3, 4, 5};
        int[] s2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] s3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        
        for(int i = 0; i < answers.length; i++) {
            if(s1[i] == answers[i]) {
            
            }
            //1, 2, 3, 4, 5/ 1, 2, 3, 4, 5/ 1, 2, 3, 4, 5
            //1, 2, 3, 4, 5/ 1, 2, 3, 4, 5/ 1, 2, 3, 4, 5
        
            if(s2[i] == answers[i]) {
            
            }
            //2 1 2 3 2 4 2 5/ 2 1 2 3 2 4 2 5/ 2 1 2 3 2 4 2 5/ 
            //1 2 3 4 5/ 1 2 3 4 5/ 1 2 3 4 5/ 1 2 3 4 5/ 1 2 3 4 5/
        
            if(s3[i] == answers[i]) {
            
            }
            //3, 3, 1, 1, 2, 2, 4, 4, 5, 5/ 3, 3, 1, 1, 2, 2, 4, 4, 5, 5
            //1, 2, 3, 4, 5/ 1, 2, 3, 4, 5/ 1, 2, 3, 4, 5/ 1, 2, 3, 4, 5
        }
        
        
        return answer;
    }
}