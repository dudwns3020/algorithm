import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        int[] answer = {};

        int[] score = new int[3];
        int[] s1 = {1, 2, 3, 4, 5};
        int[] s2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] s3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        
        for(int i = 0; i < answers.length; i++) {
            if(s1[i%s1.length] == answers[i]) {
                score[0]++;
            }        
            if(s2[i%s2.length] == answers[i]) {
                score[1]++;
            }            
            if(s3[i%s3.length] == answers[i]) {
                score[2]++;
            }
        }
        
        int max = 0;
        
        for(int i = 0; i < 3; i++) {            
            if(max <= score [i]) {
                max = score[i];
            }
        }       
        

        int hscore = 0;
        for(int i = 0; i < 3; i++) {            
            if (score[i] == max) {
                score[i] = -1;
                hscore++;
            }
        }
        
        answer = new int[hscore];
        
        int alen = 0;
        for(int i = 0; i < 3; i++) {            
            if(score[i] == -1) {
                answer[alen++] = i+1;
            }
        }        
        
        return answer;
    }
}