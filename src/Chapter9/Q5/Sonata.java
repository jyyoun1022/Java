package Chapter9.Q5;

public class Sonata extends Car{
    @Override
    public void start() {
        System.out.println("소나타 시동을 켭니다.");
    }

    @Override
    public void drive() {
        System.out.println("소나타 달립니다.");

    }

    @Override
    public void stop() {
        System.out.println("소나타 멈춥니다.");

    }

    @Override
    public void turnOff() {
        System.out.println("소나타 시동을 끕니다.");

    }
}
