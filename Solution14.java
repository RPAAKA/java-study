//프로그래머스 나누어 떨어지는 숫자 배열 (완료!)
// 1) IDE에서 돌렸을 때 코드

import java.util.ArrayList;
import java.util.Comparator;

public class Solution14 {
    public static void main(String[] args) {
        int[] arr = {2,36,1,3};
        int divisor = 1;
        ArrayList<Integer> num = new ArrayList<>();

        for(int e : arr) {
            if(e % divisor == 0) {
                num.add(e);
                num.sort(Comparator.naturalOrder());
            }
        }

        if(num.isEmpty()) {
            System.out.println(-1);
        } else {
            System.out.println(num);
        }

    }
}

// 2) 프로그래머스에서 돌렸을 때 코드
// 이건.. 넘나 힘들었다....
// 반환값이 int[] 배열이라서.. 나는 배열리스트로 풀었는데ㅠ
// 마지막에 리턴값에서 자료형 바꿔주는거 + sort 활용, 오름차순 정렬하는거..!

//import java.util.ArrayList;
//import java.util.List;
//import java.util.Comparator;
//
//class Solution {
//    public int[] solution(int[] arr, int divisor) {
//
//        ArrayList<Integer> num = new ArrayList<>();
//
//        for(int e : arr) {
//            if(e % divisor == 0) {
//                num.add(e);
//                num.sort(Comparator.naturalOrder());
//            }
//        }
//
//        if(num.isEmpty()) {
//            int[] answer = {-1};
//            return answer;
//        } else {
//            int[] answer = new int[num.size()];
//            for(int i=0; i<num.size(); i++) {
//                answer[i] = num.get(i).intValue();
//            }
//            return answer;
//        }
//
//    }
//}

