class Solution {
    public int solution(int n, int[][] computers) {
        int answer = 0;
        boolean visited = new boolean[n];
               
        for(int i = 0; i < n; i++) {
            if(visited[i] == false){
                dfs(n, computers, visited);
            }
            
        return answer;
    }
    
    public void dfs(int n, int[][] computers, boolean[] visited) {
        visited[n] = true;
            
        }
    }
}