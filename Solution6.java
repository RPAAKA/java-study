// 프로그래머스 없는 숫자 더하기

public class Solution6 {
    public static void main(String[] args) {
        int[] numbers = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] num = {5,1,4,6};
        int totalsum = 0;
        int sum = 0;

        for (int i=0; i<numbers.length; i++) {
            totalsum = totalsum + numbers[i];
        }

        for(int i=0; i<num.length; i++) {
            sum = sum + num[i];
        }

        int result = totalsum-sum;
        System.out.println(result);

    }
}
