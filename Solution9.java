// 프로그래머스 핸드폰 번호 가리기 (완료! feat. 철현님도움)

import java.util.Arrays;

public class Solution9 {
    public static void main(String[] args) {
        String phone_number = "01012345678";
        System.out.println(phone_number.charAt(0));
        System.out.println(phone_number.charAt(1));
        System.out.println(phone_number.charAt(2));

        String answer = "";

        for(int i=0; i<phone_number.length(); i++) {
            if(i<phone_number.length()-4) {
                answer = answer + "*";
            } else {
                answer = answer + phone_number.charAt(i);
            }
        }

        // 빈 문자열에 phone_number를 하나씩 더해가는 느낌?
        // 전체 phone_number문자열 길이 11에서 -4, 0~6까지는 전부 "*"를 더해나간다
        // 그 이후에는 원래 phone_number 문자열의 7,8,9,10 인덱스 값을 더한다.

        System.out.println(answer);
    }
}
