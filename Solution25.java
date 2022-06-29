//프로그래머스 정수 제곱근 판별
//프로그래머스에서는 외않되..?

public class Solution25 {
    public static void main(String[] args) {
        long n = 121; //주어지는 수 n
        long num = (long) Math.sqrt(n); // num 은 n의 제곱근
        long answer = -1;

        if( n == Math.pow(num,2)) {
            answer = (long) Math.pow(num+1, 2);
        }
        System.out.println(answer);

        // 거듭제곱을 계산해주는 함수 : Math.pow(숫자, 거듭제곱 횟수)
        // 제곱근을 구해주는 함수 : Math.sqrt(숫자)
    }
}

// 화딱지나는 코드.. (프로그래머스 기준)
// 테스트케이스 14에서만 자꾸 실패..!

//#include <stdio.h>
//#include <stdbool.h>
//#include <stdlib.h>
//
//long solution(long n) {
//     long answer = -1;
//     for(long i=0; i<n; i++) {
//        if(i*i==n) {
//          answer = (i+1)*(i+1);
//        break;
//        }
//     }
//      return answer;
//   }

//인텔리제이 코드
//    int n = 121;
//    int result = -1;
//    for(int i=0; i<n; i++) {
//       if(i*i == n) {
//        result = (i+1) * (i+1);
//        break;
//       }
//     }
//    System.out.println(result);