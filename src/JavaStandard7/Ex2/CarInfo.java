package JavaStandard7.Ex2;

public class CarInfo {
    public String carName;
    private int currentSpeed; //캡슐화(은닉 private)

    public void startEngine(){
        System.out.println(carName + "의 시동을 켠다.");
        currentSpeed=0;
    }
    private int CurrentSpeed(){
        currentSpeed = currentSpeed*10;
        return currentSpeed;
    }
    public String getCurrentSpeed(){
        return carName + "의 속도는" + CurrentSpeed();
    }
}
