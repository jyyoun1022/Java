package LackJava.String;

public class CallbyValue {

    public void method_1(){
        String a = "Ahn";
        String b = "Nick";
        System.out.println("Before Call Method2 : (a = " + a + ", b = " + b + ")");
        method_2(a,b);
        System.out.println("After Call Method2 : (a = " + a + ", b = " + b + ")");
    }

    public void method_2(String a, String b){
        a = "Nick";
        b = "Ahn";
        System.out.println("Inside Method2 : (a = " + a + ", b = " + b + ")");
    }

    public static void main(String[] args) {
        CallbyValue value = new CallbyValue();
        value.method_1();
    }
}
