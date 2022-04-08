class Solution {
    public int solution(String begin, String target, String[] words) {
        int answer = 0;
        
        boolean[] visited = new boolean[words.length];
        
        dfs(begin, target, words, visited);
        
        return answer;
    }
    
    public int dfs(String begin, String target, String[] words, boolean[] visited) {
       int no = 0;
        for(int i = 0; i < words.length ; i++) {
            int cnt = 0;
            for(int j = 0; j < begin.length() ; j++) {
                if(begin.charAt(j) == words[i].charAt(j)) {
                    cnt++;
                }
            }
            if(cnt == begin.length() - 1) {
                no++;
                begin = words[i];
                if(begin == target) {
                }
                visited[i] = true;
                dfs(begin, target, words, visited);
            }
        }
        return no;
    }
}