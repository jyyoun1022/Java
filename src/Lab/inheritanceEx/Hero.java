package Lab.inheritanceEx;

public class Hero extends Person{
    public String name;
    public int age;


    public Hero(int power, int sex, String name, int age) {
        super(power, sex);
        this.name = name;
        this.age = age;
    }

    public void move (){
        System.out.println("2배로 빨리 걸어가고 있어요.");
    }
    public  void eat(){
        System.out.println("밥 먹는 중~");
    }
    public void displayPerson(){
        System.out.println("이름 : " + name + "나이 : "  + age + "성별 : " +sex +"파워 : " +power);
    }


}
