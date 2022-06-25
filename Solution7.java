// 프로그래머스 음양 더하기(완료!)

public class Solution7 {
    public static void main(String[] args) {
        int[] absolutes = {4,7,12};
        boolean[] signs = {true, false, true};

        for(int i=0; i<signs.length; i++) {
            if(!signs[i]) {
                absolutes[i] = absolutes[i]*-1;
            }
        }

        int sum = 0;
        for(int value : absolutes) {
            sum = sum + value;
        }

        System.out.println(sum);

    }
}
