class Solution {
    int answer;
    boolean[] visited;
    
    public int solution(String begin, String target, String[] words) {
        answer = 51;
        
        visited = new boolean[words.length];
        
        dfs(begin, target, words, 0);
        
        if(answer == 51) {
            answer = 0;
        }        
        return answer;
    }
    
    public void dfs(String begin, String target, String[] words, int cnt) {
        if(begin.equals(target)) {
            if(answer > cnt) {
                answer = cnt;
            }
            return;
        }        
        for(int i = 0; i < words.length ; i++) {
            if(!visited[i] && check(begin, words[i])) {
                visited[i] = true;
                dfs(words[i], target, words, cnt + 1);
                visited[i] = false;
            }
        }
    }
    
    public boolean check (String begin, String target) {
        int same = 0;
        for(int j = 0; j < begin.length() ; j++) {
            if(begin.charAt(j) == target.charAt(j)) {
                same++;
            }
        }
        if (same == begin.length() - 1) {
            return true;
        }
        return false;
    }
}