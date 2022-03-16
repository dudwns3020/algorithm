import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

class Solution {
    public String solution(String[] participant, String[] completion) {
        //participant : 참여한 선수 이름
        //completion  : 완주한 선수 이름 (participant -1)
        //answer      : 완주못한 선수 이름
        //이름은 1~20자, 동명이인 존재가능
        String answer = "";
        HashMap<String, Integer> hm = new HashMap<String, Integer>();
        
        for(String p : participant) {
            hm.put(p, hm.getOrDefault(p, 0) + 1);
        }
            
        for(String c : completion) {            
            hm.put(c, hm.get(c) - 1);
        }
        
         for(String key : hm.keySet()) {
             if(hm.get(key) == 1) {
                 answer = key;
             }
        }        
        return answer;
    }
}