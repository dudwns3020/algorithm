class Solution {
    public String[] solution(String[][] tickets) {
        String[] answer = {};
        boolean[] visited = new boolean[tickets.length];
        
        dfs(0, "ICN", visited, tickets);
        
        return answer;
    }
    
    public void dfs(int c, String s, boolean[] visited, String[][] tickets) {
        if(c == visited.length) {
            return;
        }
        String end = null;
        for(int i = 0; i < tickets.length; i++) {
            if(s.equals(tickets[i][0])) {
                if(end !=null) {
                    int a = end.compareTo(tickets[i][1]);
                    if(a < 0) {
                        end = tickets[i][1];
                    }
                }
                end = tickets[i][1];
            }
        }
        
    }
}