import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        
        Queue<Integer> queue = new LinkedList<>();
        
        int sum_weight = 0;
        
        for(int i = 0; i < truck_weights.length; i++) {
            
            if(queue.isEmpty()) {
                queue.add(truck_weights[0]);
                answer++;
            }
            else if(queue.size() == bridge_length) {
                if(queue.peek() != 0) {
                    queue.poll();
                }
                else {
                    
                }
            }
            else {
                queue.add(0);
                answer++;
            }
        }
            
        return answer;
    }
}