import java.util.Scanner;

public class Taxi {
    int number;
    int gas;
    int currentSpeed;
    String destination;
    int basicDistance;
    int distanceForDestination;
    int fare;
    int farePerDistance;
    boolean status; //true -> 운행 / false -> 멈춤

    public boolean start(int gas) {
        if (gas>=10) {
            status == true;
        }
    }

    public int boardPassenger() {

    }

    public int changeSpeed(int speed) {
        Scanner sc = new Scanner(System.in);
        int speed = sc.nextInt(); //입력받은 속도 만큼 빼기
        currentSpeed = currentSpeed+speed;
    }

    public int ExtraFare(int basicDistance) {
        if (distanceForDestination-basicDistance > 0) {
            int finalFare = (int) (fare * farePerDistance * 1.5);
        } else {
            int finalFare = farePerDistance * fare;
        }
    }

}
