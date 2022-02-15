import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        
        Queue<Integer> queue = new LinkedList<>();

        int sum_weight = 0;
        
        for(int i = 0; i < truck_weights.length; i++) {
            if(sum_weight + truck_weights[i] <= weight) {
                queue.add(truck_weights[i]);
                answer++;
            }
            if(sum_weight + truck_weights[i] > weight) {
                queue.add(0);
                answer++;
            }
        }
        
        /*
        if(queue.size() == bridge_length && queue.peek() != 0) {
            queue.poll();
        }
        if(queue.size() == bridge_length && queue.peek() == 0) {
            queue.remove();
        }
        */
        
        return answer;
    }
}