package JavaStandard7.Ex4;

class Sample {
    public static void main(String[] args) {
        UpgradeCalculator cal= new UpgradeCalculator();
        cal.add(10);

        cal.minus(3);
        System.out.println(cal.getValue());  // 10에서 7을 뺀 3을 출력;

    }
}