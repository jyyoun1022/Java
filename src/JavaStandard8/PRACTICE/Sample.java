package JavaStandard8.PRACTICE;

public class Sample {
    public void shoudBeRun(){
        System.out.println("ok thanks.");
    }

    public static void main(String[] args) {
        Sample sample = new Sample();
        int c;
        try{
            c =4/0;
            sample.shoudBeRun();    //이코드는 실행되지 않는다.
        }catch(ArithmeticException e ){
            c=-1;
        }finally{
            sample.shoudBeRun();    //예외에 상관없이 무조건 수행한다.
        }
    }
}
