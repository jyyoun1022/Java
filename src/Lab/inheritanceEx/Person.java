package Lab.inheritanceEx;

public class Person {

    protected int power;
    protected int sex;

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }
    public Person(){}

    public Person(int power, int sex) {
        this.power = 100;
        this.sex = 1;
    }

    public void move(){
        System.out.println("걸어가고 있어요");
    }

}
