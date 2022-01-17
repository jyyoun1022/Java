package Lab.inheritanceEx;


class Persons{

    private String name;
    private int age;
    private int height;
    private int weight;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
    Persons(){}

    public Persons(String name, int age, int height, int weight) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }
    public void move(){
        System.out.println("이동해");
    }

}
class Villains extends Persons {
    private String unique_key;
    private int weapon; //1~9 숫자로 무기 분류 >>1.창 2. 방패 3. 총
    private double power;

    Villains() {
    }

    public Villains(String name, int age, int height, int weight, String unique_key, int weapon, double power) {
        super(name, age, height, weight);
        this.unique_key = unique_key;
        this.weapon = weapon;
        this.power = power;
    }

    public String getUnique_key() {
        return unique_key;
    }

    public void setUnique_key(String unique_key) {
        this.unique_key = unique_key;
    }

    public int getWeapon() {
        return weapon;
    }

    public void setWeapon(int weapon) {
        this.weapon = weapon;
    }

    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        this.power = power;
    }

    //printPerson()
    public void printPerson() {
        System.out.println("악당이름: " + getName() + " 악당나이: " + getAge() + " 악당의 키: " + getHeight() + " 악당의 몸무게: " + getWeight() + " 악당의 넘버: " + getUnique_key() + " 악당의 무기: " + getWeaponName(getWeapon()) + " 악당의 파워: " + getPower());
    }

    public String getWeaponName(int a) {
        String weapon;
        switch (a) {
            case 1:
                weapon = "창";
                break;
            case 2:
                weapon = "방패";
                break;
            case 3:
                weapon = "총";
            default:
                weapon = "업음";
                break;
        }
return weapon;
    }
}

class Heros extends  Persons{

}

public class InheritanceTest {
    public static void main(String[] args) {
       Villains vil = new Villains("좀비",20,180,80,"15001212",2,999);
       vil.printPerson();
       vil.move();
    }
}
