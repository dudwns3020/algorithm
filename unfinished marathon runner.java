class Solution {
    public String solution(String[] participant, String[] completion) {
        //participant : 참여한 선수 이름
        //completion  : 완주한 선수 이름 (participant -1)
        //answer      : 완주못한 선수 이름
        //이름은 1~20자, 동명이인 존재가능
        String answer = "";

        for(String p : participant) {
            for(String c : completion) {
                if(p.equals(c)) {
                    break;
                 }
            }
            answer = p;
            break;
        }        
        return answer;
    }
}