import java.util.*;

class Solution {
    public int[] solution(String[] genres, int[] plays) {
        int[] answer = {};
        
        HashMap<String, Integer> genresList = new HashMap<>();

        for(int i = 0; i < genres.length; i++) {
            genresList.put(genres[i], genresList.getOrDefault(genres[i], 0) + plays[i]);
        }
        
        List<String> genresKeyList = new ArrayList<>(genresList.keySet());
        genresKeyList.sort((s1, s2) -> genresList.get(s2).compareTo(genresList.get(s1)));
        
        List<Integer> answerList = new ArrayList<>();
        
        for(int i = 0; i < genresKeyList.size(); i++) {
            String g = genresKeyList.get(i);
            
            int max = 0;
            int firstIdx = -1;
            for(int j = 0; j < genres.length; j++) {
                if(g.equals(genres[j]) && max < plays[j]) {
                    max = plays[j];
                    firstIdx = j;
                }
            }
            
            max = 0;
            int secondIdx = -1;
            for(int j = 0; j < genres.length; j++) {
                if(g.equals(genres[j]) && max < plays[j] && j != firstIdx) { 
                    max = plays[j];
                    secondIdx = j;
                }
            }
            
            answerList.add(firstIdx);
            if(secondIdx >= 0) {
                answerList.add(secondIdx);
            }
        }
        
        answer = new int[answerList.size()];
        for(int i = 0; i < answerList.size(); i++) {
            answer[i] = answerList.get(i);
        }
        return answer;
    }
}