class Solution {
    static int answer = 0;
    
    public int solution(String begin, String target, String[] words) {
        answer = 51;
        
        boolean[] visited = new boolean[words.length];
        
        dfs(begin, target, words, visited, 0);
        
        if(answer == 51) {
            answer = 0;
        }        
        return answer;
    }
    
    public void dfs(String begin, String target, String[] words, boolean[] visited, int cnt) {
        if(begin.equals(target)) {
            if(answer > cnt) {
                answer = cnt;    
            }            
            return;
        }
        
        for(int i = 0; i < words.length ; i++) {
            int same = 0;
            for(int j = 0; j < begin.length() ; j++) {
                if(begin.charAt(j) == words[i].charAt(j)) {
                    same++;
                }
            }
            if(visited[i] && same == begin.length() - 1) {
                visited[i] = true;
                dfs(begin, target, words, visited, cnt + 1);
            }
        }
    }
}