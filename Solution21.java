// 프로그래머스 이상한 문자 만들기 (일단 완료)
// 이건.. 구글링해서 답안 봄ㅠㅠ
// 공백이 있을시에 어떻게 해야하는 지 몰라서....ㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠㅠ

import java.lang.String;

public class Solution21 {
    public static void main(String[] args) {
        String s = "try hello world sdfg asdasdasd asdasdasd";
        String answer = "";
        String[] str = s.split(""); // 문자열을 한 글자씩 배열로 변경!
        int idx = 0;

        for(int i=0; i<str.length; i++) {
            if(str[i].equals(" ")) {
                idx = 0;
            } else if(idx%2==0) {
                str[i] = str[i].toUpperCase();
                idx++;
            } else if(idx%2==1) {
                str[i] = str[i].toLowerCase();
                idx++;
            }
            answer = answer + str[i];
        }
        System.out.printf(answer);
    }
}


// 내가 생각했던 답안..!
// 문자열 String[i] 이걸 왜 생각못했지..?

//class Solution {
//    public String solution(String s) {
//        String answer = "";
//
//        for(int i=0; i<s.length(); i++) {
//            if(i%2==0) {
//                String uppers = s.toUpperCase();
//                answer = answer + uppers.charAt(i);
//            } else {
//                String lowers = s.toLowerCase();
//                answer = answer + lowers.charAt(i);
//            }
//        }
//
//        return answer;
//    }
//}

