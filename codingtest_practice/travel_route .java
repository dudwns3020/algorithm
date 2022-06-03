class Solution {
    public String[] solution(String[][] tickets) {
        String[] answer = {};
        
        answer = new String[tickets.length + 1];
        answer[0] = tickets[0][0];
        
        dfs(1, tickets[0][1], answer, tickets);
        
        return answer;
    }
    
    public void dfs(int c, String s, String[] answer, String[][] tickets) {
        if(c > 5) {
            return;
        }
        answer[c] = s;
        for(int i = 0; i < tickets.length; i++) {            
            if(s.equals(tickets[i][0])) {
                s = tickets[i][1];
                c++;
                dfs(c, s, answer, tickets);
            }
        }
    }
}