import java.util.*;

class Solution {
    public int solution(String numbers) {
        int answer = 0;        
        
        String[] piece = new String[numbers.length()];
        
        for(int i = 0; i < numbers.length(); i++) {
            piece[i] = String.valueOf(numbers.charAt(i));
        }
            
        for(int i = 0; i < numbers.length(); i++) {
            String[] output = new String[i + 1];
            boolean[] visited = new boolean[numbers.length()];
            permutation(piece, output, visited, 0, i + 1);
        }
        
        answer = cnt;
        
        return answer;
    }
    
    int cnt = 0;
    
    HashMap<Integer, Integer> map = new HashMap<>();
    
    boolean isPrime(int num) {
        for(int i = 2; i < num; i++) {
            if(num % i == 0 ) return false; 
        }
        return true;
    }
    
    public void permutation(String[] arr, String[] output, boolean[] visited, int depth, int r) {
        if(depth == r) {
            String temp = "";
            for(String a: output) {
                temp += a;
            }
            
            while(temp.length() > 1 && temp.charAt(0) == '0') {
                temp = temp.substring(1);
            }
            
            if(temp.equals("0") || temp.equals("1")) return;
            
            int result = Integer.parseInt(temp);
            
            map.put(result, map.getOrDefault(result, 0) + 1);
            if(map.get(result) == 1) {
                if(isPrime(result)) {
                    cnt++;
                }
            }
            return;
        }
        
        for(int i = 0; i < arr.length; i++) {
            if(!visited[i]) {
            visited[i] = true;
            output[depth] = arr[i];
            permutation(arr, output, visited, depth+1, r);
            visited[i] = false;
            }
        }
    }
}