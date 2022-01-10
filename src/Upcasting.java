import com.sun.security.jgss.GSSUtil;

public class Upcasting {}
    class Soup{
        public void seasoning(){
            System.out.println("간안맞춤");
        }

    }
    class Bonesoup extends Soup{
        @Override
        public void seasoning() {
            System.out.println("뼈해장국에 뼈없어");
        }
    }
    class Beansoup extends Soup{
        @Override
        public void seasoning() {
            System.out.println("콩나물해장국에는 콩나물안넣어");
        }
    }
    class Buyer{
        public void eatsoup(Soup whatsoup){
            whatsoup.seasoning();
        }
    }
    class CastingTest{
        public static void main(String[] args) {
            Buyer buy1 =new Buyer();
            Soup sell = new Bonesoup();//sell은 객체는 Bonesoup지만,soup형이므로  soup클래스의 변수,메서드만 사용가능하지만,출력은 뼈해장국으로
            buy1.eatsoup(sell);
        }

}
