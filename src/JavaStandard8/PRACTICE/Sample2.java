package JavaStandard8.PRACTICE;

class FoolException extends RuntimeException{}

public class Sample2 {
    public void sayNick(String nick) {
        if("fool".equals(nick)) {
            throw new FoolException();
            //return 했던 부분을 throw new FoolException()으로 변경
        }
        System.out.println("당신의 별명은 "+nick+" 입니다.");
    }

    public static void main(String[] args) {
        Sample2 test = new Sample2();
        test.sayNick("fool");
        test.sayNick("genious");
    }
}//sayNick 메서드는 fool이라는 문자열이 입력되면 reuturn으로 메서드를 종료하여 별명이 출력되지 못하도록 하고있다.

