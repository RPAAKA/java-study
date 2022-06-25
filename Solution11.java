// 프로그래머스 x만큼 간격이 있는 (완료! 자료형 조심!!)

import java.util.Arrays;
import java.util.Scanner;

public class Solution11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();

        long[] num = new long[n];
        for(int i=0; i<n; i++) {
            num[i] = (x + ((long)x * i));
        }

        System.out.println(Arrays.toString(num));
    }
}
