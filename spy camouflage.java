import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        int answer = 0;
        
        HashMap<String, String> hm = new HashMap<>();

        for(int i = 0; i < clothes.length; i++) {
                hm.put(clothes[i][0], clothes[i][1]);
        }
        //["yellowhat", "headgear"]
        //["bluesunglasses", "eyewear"]
        //["green_turban", "headgear"]
       
        int sum = clothes.length;
        System.out.println(hm.get(clothes[0][0]));
        System.out.println(hm.get(clothes[2][0]));
        
        if(hm.get(clothes[0][0]) == hm.get(clothes[2][0])) {
            System.out.println("같다");
        }
        else {
            System.out.println("다르다");
        }
        
        for(int i = 0; i < clothes.length; i++) {
            for(int j = i+1; j < clothes.length; j++) {
                if(hm.get(clothes[i][0]) == hm.get(clothes[j][0])) {    
                    sum-= 1;
                }
            }
        }
        
        return answer;
    }
}