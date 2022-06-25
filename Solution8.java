//프로그래머스 평균 구하기 (완료!)

public class Solution8 {
    public static void main(String[] args) {
        int[] array = {1,2,3,4};
        double sum = 0;

        for(int i=0; i<array.length; i++) {
            sum = sum + array[i];
        }
//        System.out.println(sum);

        double result = sum/array.length;
        System.out.println(result);
    }
}
