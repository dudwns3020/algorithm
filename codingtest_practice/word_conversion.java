class Solution {
    public int solution(String begin, String target, String[] words) {
        int answer = 0;
        
        String[] bg = new String[begin.length()];
        String[] tg = new String[target.length()];
        
        for(int i = 0; i < begin.length(); i++) {
            bg[i] = begin.substring(i, i+1);
            tg[i] = target.substring(i, i+1);
        }
        
        return answer;
    }
}