package JavaStandard7.Ex4;

public class UpgradeCalculator extends Calculator{

    public void minus(int val){
        this.value -= val;
    }
    public int getValue(){
        return  this.value;
    }
}
