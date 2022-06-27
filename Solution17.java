//프로그래머스 문자열 다루기 기본 (완료!)

public class Solution17 {
    public static void main(String[] args) {
        final String numbers = "[0-9]+"; // 변수 앞에 final을 붙이면 수정할 수 없다는 뜻임!, 숫자만 나타내는 정규식

        //테스트케이스
        String str1 = "aadsgdsnbraeg";
        String str2 = "a1234";
        String str3 = "1234";
        String str4 = "1";

//        if (str1.matches("^[a-zA-Z]+")) { // <- 문자열 정규식
//            System.out.println(true);
//        } else {
//            System.out.println(true);
//        }

        if ((str4.length() == 4 || str4.length() == 6) && str4.matches(numbers)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}

// 프로그래머스 풀이코드
//class Solution17 {
//    public boolean Solution17 (String s) {
//        final String numbers = "[0-9]+";
//
//        if((s.length()==4 || s.length()==6) && s.matches(numbers)) {
//            return true;
//        } else {
//            return false;
//        }
//    }
//}
