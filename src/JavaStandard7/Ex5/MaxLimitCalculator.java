package JavaStandard7.Ex5;

public class MaxLimitCalculator extends Calculator{
    @Override
    void add(int val) {
        this.value += val;
        if (this.value > 100) {
            this.value = 100;
        }
    }
}


