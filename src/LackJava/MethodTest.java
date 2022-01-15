package LackJava;

public class MethodTest {
public int result;
    public int add(int num){
         result += num;
        return result;
    }
     public int sum(int a,int b){
        return a+b;
    }

    public static void main(String[] args) {
        int a=3;
        int b=4;

        MethodTest sample =new MethodTest();
        int c = sample.sum(a,b);

        System.out.println(c);//7출력
    }
}
