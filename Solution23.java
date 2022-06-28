//프로그래머스 자연수 뒤집어 배열로 만들기 (완료..!)

import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


public class Solution23 {
    public static void main(String[] args) {

        long num = 1850321352;//주어진 수

        String str = String.valueOf(num); //문자로 변경

        String[] arr = str.split(""); //문자열 배열로 하나씩 잘라서 넣음

        ArrayList<String> reverseArr = new ArrayList<>(Arrays.asList(arr)); //arraylist 만들어서 문자열 배열 집어넣기

        Collections.reverse(reverseArr); //거꾸로 뒤집기

        String[] arr2 = reverseArr.toArray(new String[reverseArr.size()]); // arraylist를 다시 문자열 배열로..

        int[] answer = Arrays.stream(arr2).mapToInt(Integer::parseInt).toArray(); // stream 활용 string배열->int배열로 변경..

        System.out.println(Arrays.toString(answer));

        // 이거 맞냐..ㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋ
        // 진짜 미^치^겠^네 ^^
    }
}
