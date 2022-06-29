//프로그래머스 정수 내림차순으로 배치하기 (완료!)

import java.lang.String;
import java.util.Arrays;
import java.util.Comparator;

public class Solution24 {
    public static void main(String[] args) {
        long num = 118372;
        String str = String.valueOf(num);
        String[] result = str.split("");
        Arrays.sort(result, Comparator.reverseOrder());

        String answer = "";
        for(int i=0; i<result.length; i++) {
            answer = answer + result[i];
        }

        long final_answer = Long.parseLong(answer);
        System.out.println(final_answer);



    }
}

// 프로그래머스 제출 코드

//import java.lang.String;
//import java.util.Arrays;
//import java.util.Comparator;
//
//class Solution {
//    public long solution(long n) {
//        String str = String.valueOf(n);
//        String[] result = str.split("");
//        Arrays.sort(result, Comparator.reverseOrder());
//
//        String str2 = "";
//        for(int i=0; i<result.length; i++) {
//            str2 = str2 + result[i];
//        }
//
//        long answer = Long.parseLong(str2);
//        return answer;
//    }
//}
