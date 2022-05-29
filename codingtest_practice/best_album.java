import java.util.*;

class Solution {
    public int[] solution(String[] genres, int[] plays) {
        int[] answer = {};
        
        HashMap<String, Integer> genresList = new HashMap<>();
        HashMap<Integer, Integer> playsList = new HashMap<>();

        for(int i = 0; i < genres.length; i++) {
            genresList.put(genres[i], genresList.getOrDefault(genres[i], 0) + plays[i]);
        }
        
        List<String> genresKeyList = new ArrayList<>(genresList.keySet());
        genresKeyList.sort((s1, s2) -> genresList.get(s2).compareTo(genresList.get(s1)));
        
        List<Integer> answerList = new ArrayList<>();
        
        for(String s: genresKeyList) {
            for(int i = 0; i < genres.length; i++) {
                if(s.equals(genres[i])) {
                    playsList.put(i, plays[i]);
                }
            }
            List<Integer> keyList = new ArrayList<>(playsList.keySet());
            keyList.sort((s1, s2) -> playsList.get(s2).compareTo(playsList.get(s1)));
            
            int j = 0;
            for(int c : keyList) {
                if(j > 1) {
                    break;
                }
                answerList.add(c);
                j++;
            }
            playsList.clear();
        }
        
        answer = new int[answerList.size()];
        for(int i = 0; i < answerList.size(); i++) {
            answer[i] = answerList.get(i);
        }
        return answer;
    }
}