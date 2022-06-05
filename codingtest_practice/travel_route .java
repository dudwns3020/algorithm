import java.util.*;

class Solution {
    public String[] solution(String[][] tickets) {
        String[] answer = {};
        boolean[] visited = new boolean[tickets.length];   
        dfs(0, "ICN", visited, tickets);

        return answer;
    }
    
    public void dfs(int c, String s, boolean[] visited, String[][] tickets) {
        if(c == tickets.length) {
            return;
        }
        for(int i = 0; i < tickets.length; i++) {
            if(!visited[i] && s.equals(tickets[i][0])) {
                visited[i] = true;
                dfs(c, tickets[i][1], visited, tickets);
                visited[i] = false;    
            }
        }
   }
}