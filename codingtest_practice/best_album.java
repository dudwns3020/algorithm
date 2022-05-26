import java.util.*;

class Solution {
    public int[] solution(String[] genres, int[] plays) {
        int[] answer = {};
        
        HashMap<String, Integer> genres_list = new HashMap<>();
        HashMap<Integer, Integer> plays_list = new HashMap<>();
        
        for(int i = 0; i < genres.length; i++) {
            genres_list.put(genres[i], genres_list.getOrDefault(genres[i], 0) + plays[i]);
        }
        
        // for(String s: genres_list.keySet()) {
        //     System.out.println(s + ", " +genres_list.get(s));
        // }
        for(String s: genres_list.keySet()) {
            for(int i = 0; i < genres.length; i++) {
                if(genres[i].equals(s)) {
                    plays_list.put(i, plays[i]);
                }
            }
            
            //vaule
            
            for(int n: plays_list.keySet()) {
                System.out.println(genres[n] + n + ", " + plays_list.get(n));
            }
            plays_list.clear();
        }
        
        return answer;
    }
}