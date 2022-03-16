import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        
        Queue<Integer> queue = new LinkedList<>();
        
        int sum_weight = 0;
        
        for(int i = 0; i < truck_weights.length; i++) {
            while(true) {
                if(queue.isEmpty()) {
                    queue.add(truck_weights[i]);
                    sum_weight += truck_weights[i];
                    answer++;
                    break;
                }
                else if(queue.size() == bridge_length) {
                    sum_weight -= queue.poll();
                }
                else {
                    if(sum_weight + truck_weights[i] <= weight) {
                        queue.add(truck_weights[i]);
                        sum_weight += truck_weights[i];
                        answer++;
                        break;
                    }
                    else {
                        queue.add(0);
                        answer++;
                    }

                }
            }
        }
        answer += bridge_length;
        
        return answer;
    }
}