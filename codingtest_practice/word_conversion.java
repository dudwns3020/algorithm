class Solution {
    public int solution(String begin, String target, String[] words) {
        int answer = 0;
        
        boolean[] visited = new boolean[words.length];
        
        dfs(begin, target, words, visited);
        
        return answer;
    }
    
    public void dfs(String begin, String target, String[] words, boolean[] visited) {
        boolean visieted = true;
        
        int cnt = 0;
        
        for(int i = 0; i < begin.length() ; i++) {
            if(begin.charAt(i) == comparsion.charAt(i)) {
                cnt++;
            }
            System.out.println(cnt);
        }

        
        // for(int i = 0; i < words.length; i++) {
        //     if(cnt == begin.length() - 1) {
        //         dfs(begin, target, words, visited);
        //     }            
        // }
    }
}