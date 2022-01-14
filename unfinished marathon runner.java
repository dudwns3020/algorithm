import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        //participant : 참여한 선수 이름
        //completion  : 완주한 선수 이름 (participant -1)
        //answer      : 완주못한 선수 이름
        //이름은 1~20자, 동명이인 존재가능
        String answer = "";
        HashMap<Integer, String> hm = new HashMap<Integer, String>();
        
        for(String p : participant) {
            hm.put(p, 1);            
        }        
        for(String c : completion) {
            hm.put(completion, hm.get(c)-1);
        }
        return answer;
    }
}