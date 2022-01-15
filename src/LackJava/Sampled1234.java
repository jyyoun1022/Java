package LackJava;

public class Sampled1234 {

    public void method_1(){
        int a = 10;
        int b= 5;
        System.out.println("Before Call Method2 : (a = " + a + ", b = " + b + ")");
        method_2(a,b);
        System.out.println("After Call Method2 : (a = " + a + ", b = " + b + ")");
    }
    public void method_2(int a, int b){
         a= 20;
         b=10;
        System.out.println("Inside Method2 : (a = " + a + ", b = " + b + ")");
    }

    public static void main(String[] args) {
        Sampled1234 one = new Sampled1234();
        one.method_1();

    }
}
