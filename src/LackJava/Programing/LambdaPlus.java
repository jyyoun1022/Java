package LackJava.Programing;
@FunctionalInterface
interface Calculator1 {
    int sum(int a, int b);
}
public class LambdaPlus  {
    public static void main(String[] args) {
        Calculator mc = Integer :: sum;
        int result = mc.sum(3,4);
        System.out.println(result);
    }
}
