package JavaStandard8.PRACTICE;

public class ExceptionEx6 {
    public static void main(String[] args) {
        try{
            Exception e = new Exception("고의로 발생시킴");
            throw e;    //예외를 발생시킴
            //throw new Excoption("고의로 발생시킴"); 위의 두줄을 한줄로 줄여쓸수 있다.
        } catch (Exception e){
            System.out.println("에러 메세지 : " +e.getMessage());
            e.printStackTrace();
        }
        System.out.println("프로그램이 정상종료되었습니다.");
    }
}
