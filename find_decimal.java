class Solution {
    public int solution(String numbers) {
        int answer = 0;
        
        String[] piece = new String[numbers.length()];
        /*
        for(int i = 0; i < numbers.length(); i++) {
            piece[i] = Integer.parseInt(numbers.substring(i, i+1));
        }
        */
        int r = piece.length;
        String[] output = new String[r];
        boolean[] visited = new boolean[r];
        permutation(piece, output, visited, 0, r);
        
        return answer;
    }
    
    public static void permutation(String[] arr, String[] output, boolean[] visited, int depth, int r) {
        if(depth == r) {
            for(int i = 0; i < r; i++) {
                System.out.print(output[i]);
            }
            System.out.println();
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