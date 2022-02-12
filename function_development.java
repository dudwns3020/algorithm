import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int[] answer = {};
        
        Queue<Integer> q = new LinkedList<>();
        
        for(int i = 0; i < progresses.length; i++) {
            while(progresses[i] < 100) {
                progresses[i] += speeds[i];
                if(progresses[i] >= 100) {
                    q.add(progresses[i]);
                }
            }
        }

        for(int a: q) {
            System.out.println(a);
        }
        return answer;
    }
}