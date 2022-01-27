import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        int[] answer = {};
        
        int[] one = new int[answers.length];
        int[] two = new int[answers.length];
        int[] thr = new int[answers.length];
        

        for(int i = 0; i < answers.length; i++) {
            int[] cnt = {1, 2, 3, 4, 5};
            one[i] = cnt[j];
            j++;
        }
        
        for(int i : one) {
            System.out.println(i);
        }
        
        /*
        for(int i = 0; i < answers.length; i++) {
            //2, 1, 2, 3, 2, 4, 2, 5
        }
        
        for(int i = 0; i < answers.length; i++) {
            //3, 3, 1, 1, 2, 2, 4, 4, 5, 5
        }
        */
        return answer;
    }
}