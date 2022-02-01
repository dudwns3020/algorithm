import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        int[] answer = {};
        
        int s = 3;
        int[] score = new int[s];
        int[] s1 = {1, 2, 3, 4, 5};
        int[] s2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] s3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        
        for(int i = 0; i < answers.length; i++) {
            if(s1[i] == answers[i]) {
                score[0] += 1;
            }        
            if(s2[i] == answers[i%5]) {
                score[1] += 1;
            }            
            if(s3[i] == answers[i%8]) {
                score[2] += 1;
            }
        }
        
        int hs = score[0];
        for(int j = 0; j < s; j++) {            
            if(hs < score [j]) {
                hs = score[j];
            }
        }       
       
        ArrayList<Integer> list = new ArrayList<>();
        
        return answer;
    }
}