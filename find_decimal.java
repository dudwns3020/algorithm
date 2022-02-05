class Solution {
    public int solution(String numbers) {
        int answer = 0;
         
        String[] paper = new String[numbers.length()];

        for(int i = 0; i < numbers.length(); i++) {
            paper[i] = numbers.substring(i, i+1);
        }
        
        String[] sum = new String[numbers.length() * numbers.length()];
        int cnt = 0;
        for(int i = 0; i < numbers.length(); i++) { 
            for(int j = 0; j < numbers.length(); j++) { 
                if(i == j) {
                    sum[cnt++] = paper[i];
                }
                else {
                    sum[cnt++] = paper[i] + paper[j];
                }
            }
        } // 101(X)
        
        for(String a : sum) {
            System.out.println(a);
        }
        
        /*int[] piece = new int[sum.length];
        
        for(int i = 0; i < sum.length; i++) {
            piece[i] = Integer.parseInt(sum[i]);
        }
        
        for(int a : piece) {
            System.out.println(a);
        }*/
        return answer;
    }
}