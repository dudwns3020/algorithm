import java.util.PriorityQueue;
import java.util.Collections;

class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;

        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        
        for(int a: priorities) {
            queue.add(a);
        }
        
        while(!queue.isEmpty()){
            for(int i = 0; i < priorities.length; i++) {
                if(priorities[i] == queue.peek()) {
                    queue.poll();
                    answer++;
                    if(i == location) {
                        return answer;
                    }
                }            
            }
        }
        
        return answer;
    }
}