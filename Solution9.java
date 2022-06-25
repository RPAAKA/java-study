// 프로그래머스 핸드폰 번호  가리기

import java.util.Arrays;

public class Solution9 {
    public static void main(String[] args) {
        String phone_number = "01012345678";
        String beStar = phone_number.substring(0,7).replaceAll("[0-9]","*");


        System.out.println(phone_number);






    }
}
