import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;

        Queue<Integer> queue = new LinkedList<>();        
        for(int a: priorities) {
            queue.add(a);
        }
        
        for(int a: queue) {
            for(int b: priorities) {
                if(queue.peek() < a) {
                   queue.add(queue.poll());
                  break;
                }
            }
        }
        
        for(int c: queue) {
            System.out.print(c);
        }
        
        return answer;
    }
}