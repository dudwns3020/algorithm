import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands[0].length];
        
        for(int i = 0; i < commands[0].length; i++) {
            int[] str = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]);
            Arrays.sort(str);
            int a = str[commands[i][2]-1];
            answer[i] = a;
        }
        
        return answer;
    }
}
//테스트 실패