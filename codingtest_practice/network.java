class Solution {
    public int solution(int n, int[][] computers) {
        int answer = 0;
        
        dfs(n, computers);
        
        return answer;
    }
    
    public void dfs(int n, int[][] computers) {
        for(int i = 0; i < n; i++) {
            dfs(n, computers);
        }
    }
}