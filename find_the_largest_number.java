import java.util.*;

class Solution {
    public String solution(int[] numbers) {
        String answer = "";
        String[] first = new String[numbers.length];        

        int len = 1;

        for(int i = numbers.length; i > 0; i--) {
            len *= i;
        }
        
        for(int i = 0; i < numbers.length; i++) {
            first[i]  = String.valueOf(numbers[i]);
        }
        
        String[] second = new String[len];

        /*
        for(int i = 0; i < numbers.length; i++) {
            for(int j = 0; j < numbers.length; j++){
                if(i != j) {
                    second[i] += first[j];
                }
            }
        }
        */
        
        for(int i = 0; i < len; i++) {
            System.out.println(second[i]);
        }
        
        return answer;
    }
}