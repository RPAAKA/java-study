import java.util.Scanner;

public class Bus {
    int maxPassenger;
    int currentPassenger;
    int fare;
    final int BusNumber;
    int gas;
    int currentSpeed;
    boolean status; //true -> 운행, false -> 정지

    public Bus(int busNumber) {
        BusNumber = busNumber;
    }

    public boolean isRiding() {
        if(status == true) {
            System.out.println("운행");
        } else {
            System.out.println("차고지 행");
        }

        if(gas<10) {
            System.out.println("주유가 필요합니다.");
        }
    }

    public int ridePassenger() {
        currentPassenger++;
    }

    public int changeSpeed(int speed) {
        if(gas<10) {
            System.out.println("주유량을 확인해주세요.");
        }
        Scanner sc = new Scanner(System.in);
        int speed = sc.nextInt(); //입력받은 속도 만큼 더하거나 빼기
        currentSpeed = currentSpeed+speed;


    }
}
