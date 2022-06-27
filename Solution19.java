//프로그래머스 수박수박수박수? (완료)

public class Solution19 {
        public static void main(String[] args) {
        int n = 4;
        String answer = "";

        for (int i=0; i<n; i++) {
            if(i%2==1) {
                answer = answer + "박";
            } else {
                answer = answer + "수";
            }
        }

        System.out.println(answer);
    }
}

// 이렇게 푸는 사람도 있네!

//public class Solution19 {
//    public String Solution19 (int n) {
//        StringBuffer wm = new StringBuffer();
//        for(int i=1; i<=n; ++i) {
//            wm.append(i%2==1 ? "수":"박");
//        }
//        return wm.toString();
//    }
//
//    public static void main(String[] args) {
//        Solution19 wm = new Solution19();
//        System.out.println("n이 3인 경우:" + wm.Solution19(3));
//    }
//}