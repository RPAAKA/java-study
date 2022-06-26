//프로그래머스 내적 (완료!)

public class Solution15 {
    public static void main(String[] args) {
        int[] a = {-1,0,1};
        int[] b = {1,0,-1};
        int[] array = new int[a.length];

        for (int i=0; i<a.length; i++) {
            array[i] = a[i]*b[i];
        }

        int answer = 0;
        for (int i=0; i<array.length; i++) {
            answer = answer+array[i];
        }

        System.out.println(answer);

    }
}
