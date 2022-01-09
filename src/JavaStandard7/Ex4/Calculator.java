package JavaStandard7.Ex4;

public class Calculator {
    public int value;

    public Calculator() {
        this.value = 0;
    }

    public void add(int val) {
        this.value += val;
    }

    public int getValue() {
        return this.value;
    }
}

