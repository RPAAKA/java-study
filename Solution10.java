// 프로그래머스 행렬의 덧셈 (완료!)

import java.util.Arrays;

public class Solution10 {
    public static void main(String[] args) {
        int[][] arr1 = {{3,4,3}, {5,6,3}, {12,1,3}};
        int[][] arr2 = {{1,2,3}, {2,3,5}, {10,5,4}};
        int[][] arr3 = new int [arr1.length][arr1[0].length];

        // !!!!다차원 배열에서!!!!! (arr1이 다차원 배열이라 할 때)
        // arr1.length는 행의 갯수
        // arr1[0].length는 열의 갯수
        // arr1[i].length는 i번째 값 안의 갯수

//        for(int i=0; i<arr1.length; i++) {
//            arr3[i][i] = arr1[i][i] + arr2[i][i];
//        }
//        // 이렇게 더하면 1,1 끼리 더하고, 2,2 끼리 더하고, 3,3 끼리 더한다..!


        for(int a=0; a<arr1.length; a++) {
            for(int b=0; b<arr1[0].length; b++) {
                arr3[a][b] = arr1[a][b] + arr2[a][b];
                }
            }

        System.out.println(Arrays.deepToString(arr3));

    }
}
