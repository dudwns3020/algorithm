import java.util.*;

class Solution {
    ArrayList<String> answer;
    boolean[] visited;
    
    public String[] solution(String[][] tickets) {
        answer = new ArrayList<>();
        visited = new boolean[tickets.length];
        
        dfs(0, "ICN", "ICN", tickets);

        Collections.sort(answer);
        
        return answer.get(0).split(" ");
    }
    
    public void dfs(int c, String s, String r, String[][] tickets) {
        if(c == tickets.length) {
            answer.add(r);
            return;
        }
        for(int i = 0; i < tickets.length; i++) {
            if(!visited[i] && s.equals(tickets[i][0])) {
                visited[i] = true;
                dfs(c+1, tickets[i][1], r + " " + tickets[i][1] ,tickets);
                visited[i] = false;
            }
        }
    }
}