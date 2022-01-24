import java.util.*;

class Solution {
    public String solution(int[] numbers) {
        String answer = "";
        
        String[] largest = new String[numbers.length];       
        
        for(int i = 0; i < numbers.length; i++) {
            largest[i]  = String.valueOf(numbers[i]);
        }
        
        Arrays.sort(largest, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return (s2+s1).compareTo(s1+s2);
            }
        });
        
        if(largest[0].equals("0")) {
            return "0";
        }
                
        for(String str : largest) {
            answer += str;
        }
        
        return answer;
    }
}