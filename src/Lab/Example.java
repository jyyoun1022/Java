package Lab;

class TestNum{
    int num;

    public TestNum(int num) {
        this.num = num;
    }
}

public class Example {

    public static void sum(TestNum a){
        System.out.println("sum() 메서드 안에서의 a 값 : " +a);
        System.out.println(a.num);
        a.num += 400;
        System.out.println(a.num);
    }
    public static void main(String[] args) {
        TestNum a = new TestNum(100);
        sum(a); //TestNum의 주소값,100,500
        System.out.println(a);//testNum의 주소값
        System.out.println(a.num);//500
    }

}

