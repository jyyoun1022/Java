package LackJava.Programing;
//일반적인 람다함수
public class CalculatorLambda {
    public static void main(String[] args) {
        Calculator sum = (int a, int b) -> a+b;
        Calculator sub = (int a, int b) ->a-b;
        Calculator times =(int a, int b) -> a*b;
        Calculator divide = (int a, int b) -> a/b;
        int result = sum.sum(3,4);
        System.out.println(result);
        int result1 = sub.sum(10,5);
        System.out.println(result1);
        int result2 = times.sum(24,5);
        System.out.println(result2);
        double result3 = divide.sum(45,2);
        System.out.println(result3);

    }
}
