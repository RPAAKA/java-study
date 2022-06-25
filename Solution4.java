//프로그래머스 두 정수 사이의 합 (완료)

public class Solution4 {
    public static void main(String[] args) {
        int a = 5;
        int b = 3;
        int answer = 0;

        if(a==b) {
            answer = a;
        } else if (a>b) {
            for(int i=b; i<a+1; i++) {
                answer = answer + i;
            }
        } else if (a<b) {
            for(int j=a; j<b+1; j++) {
                answer = answer + j;
            }
        }

        System.out.println(answer);

    }
}
