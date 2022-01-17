import java.util.*;

class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        
        HashMap<String, Integer> hm = new HashMap<String, Integer>();
        
        for(int i = 0; i < phone_book.length; i++) {
            hm.put(phone_book[i], i);
        }
        for(int i = 0; i < phone_book.length; i++) {
            for(int j = 0; j < phone_book[i].length(); j++) {
                if(hm.containsKey(phone_book[i].substring(0, j))) {
                    return false;
                };
            }
        }
        
        return answer;
        
        /* //정확성X //효율성X
        for(String p : phone_book) {
            for(String s : phone_book) {
                if(p.contains(s)) {
                    if( p != s) {
                        answer = false;
                    }
                }
            }
        }
        */
        
        /* //효율성X
        for(String p : phone_book) {
            for(String s : phone_book) {
                if(p.startsWith(s)) {
                    if( p != s) {
                        answer = false;
                    }
                }
            }
        }
        */
    }
}
