package JavaStandard7.Ex6;

public class Calculator {
    int value;

    Calculator() {
        this.value = 0;
    }

    void add(int val) {
        this.value += val;
    }

    int getValue() {
        return this.value;
    }
    public boolean isOdd(int num){ //boolean자료형을 써서 만약 num이 홀수면 true,나머지 짝수면 false.
       return num%2==1;
    }
}
