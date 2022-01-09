package JavaStandard6;

public class MyMath {
    long add(long a, long b){
        long result = a+b;
        return result;
        //return a+b;

    }
}
class MM{
    public static void main(String[] args) {
        MyMath mm = new MyMath();

        long value =mm.add(1L,2L);

        System.out.println(value
        );
    }
}
