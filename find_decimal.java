class Solution {
    public int solution(String numbers) {
        int answer = 0;
        
        int paper = Integer.parseInt(numbers);
        int[] piece = new int[numbers.length()];
            
        for(int i = 0; i < numbers.length(); i++) {
            piece[i] = paper%10;
        }
        //011 -> 11 (X)
        
        return answer;
    }
}