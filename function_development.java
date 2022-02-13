import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int[] answer = {};
        
        Queue<Integer> queue = new LinkedList<>();
        
        for(int i = 0; i < progresses.length; i++) {
            queue.add((int)(Math.ceil((100.0 - progresses[i]) / speeds[i])));
        }

        while(!queue.isEmpty()) {
            int day = queue.poll();
            int cnt = 1;
            if(!queue.isEmpty() && day >= queue.peek()) {
                queue.poll();
                cnt++;
            }
            
        }
  
        return answer;
    }
}