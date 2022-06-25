// 프로그래머스 부족한 금액 계산하기 (완료!)
public class Solution12 {
    public static void main(String[] args) {
        int money = 20;
        int price = 3;
        int count = 4;
        int result = 0;

        for (int i=0; i<count; i++) {
            result = money - price * (i+1);
            money = result;
        }

        if(result < 0) {
            result = result * -1;
        } else {
            result = 0;
        }

        System.out.println(result);

    }
}
