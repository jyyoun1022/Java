package JavaStandard6;

class Data1{
    int value;  //Data1(){} 디폴트 생성자
}
class Data3{
    int value;

    Data3(int x){       //매개변수가 있는 생성자.
        this.value=x;
    }
}
public class ConstructorTest {
    public static void main(String[] args) {
        Data1 d1 =new Data1();
//        Data3 d3 =new Data3();  //compile error발생
    }
}
