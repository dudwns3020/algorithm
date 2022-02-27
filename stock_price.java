import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int[] solution(int[] prices) {
        int[] answer = {};
        
        Queue<Integer> queue = new LinkedList<>();
        
        for(int a: prices) {
            queue.add(a);
        }
        
        answer = new int[queue.size()];
        
        for(int i = 0; i < prices.length; i++) {
            int cnt = 0;
            for(int j = i + 1; j < prices.length; j++) {
                if(queue.peek() <= prices[j]) {
                    cnt++;
                }
            }
            queue.poll();
            answer[i] = cnt;
        }
        
        return answer;
    }
}