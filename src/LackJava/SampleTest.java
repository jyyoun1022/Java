package LackJava;

public class SampleTest {
    int a;

    public void varTest(SampleTest idontknow){
        idontknow.a++;
    }

    public static void main(String[] args) {
        SampleTest ssibal = new SampleTest();
        ssibal.a =1;
        ssibal.varTest(ssibal);
        System.out.println(ssibal.a);
    }

}
