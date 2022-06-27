// 프로그래머스 서울에서 김서방 찾기 (완료!)
import java.util.Arrays;

public class Solution18 {
    public static void main(String[] args) {
        String[] seoul = {"Jane", "Kim", "Park", "Lee"};
        int result = Arrays.asList(seoul).indexOf("Kim");
        String answer = String.format("김서방은 %d에 있다.", result);

        System.out.println(answer);
    }
}

//프로그래머스 제출 완료 코드

//import java.util.Arrays;
//
//class Solution {
//    public String solution(String[] seoul) {
//        int result = Arrays.asList(seoul).indexOf("kim");
//        String answer = String.format("김서방은 %d에 있다", result);
//        return answer;
//    }
//}