//프로그래머스 자릿수 더하기 (완료!)

import java.util.Arrays;
import java.util.stream.Stream;

public class Solution22 {
    public static void main(String[] args) {
        int n = 987;
        int[] numbers = Stream.of(String.valueOf(n).split("")).mapToInt(Integer::parseInt).toArray();
        System.out.println(Arrays.toString(numbers));

        int answer = 0;

        for(int i=0; i<numbers.length; i++) {
        answer = answer + numbers[i];
        }

        System.out.println(answer);
    }
}


