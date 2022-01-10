package JavaStandard8.PRACTICE;

class FoolException1 extends Exception{}
public class Sample3 {

    public void sayNick(String nick) {
            try {
                if("fool".equals(nick)) {
                    throw new FoolException();
                }
                System.out.println("당신의 별명은 "+nick+" 입니다.");
            }catch(FoolException e) {
                System.err.println("FoolException이 발생했습니다.");
            }
        }

        public static void main(String[] args) {
            Sample3 sample = new Sample3();
            sample.sayNick("fool");
            sample.sayNick("genious");
        }
    }

