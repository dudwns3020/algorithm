class Solution {
    public int solution(int n, int[][] computers) {
        int answer = 0;
        boolean[] visited = new boolean[n];
        
        for(int i = 0; i < n; i++) {
            if(visited[i] == false){
                answer++;
                dfs(i, computers, visited);
            }
        }
        return answer;
    }
        
    public void dfs(int n, int[][] computers, boolean[] visited) {
        visited[n] = true;
        
        for(int i = 0; i < computers.length; i++) {
            if (visited[i] == false && computers[n][i] == 1) {
                dfs(i, computers, visited);
            }
        }
    }
}