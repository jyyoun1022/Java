package JavaStandard6;
class Card{
    String kind;
    int number; //인스턴스변수
    static int width = 100;
    static int height = 250;    //클래스변수(static변수)
}
public class CardTest {
    public static void main(String[] args) {
        Card c1 =new Card();
        c1.kind ="Heart";
        c1.number = 7;
        Card c2 = new Card();
        c2.kind= "Diamond";
        c2.number = 5;
        System.out.println("c1은"+c1.kind+ ","+c1.number+"이며 크기는"+c1.width+","+c1.height+"입니다.");
        System.out.println("c2은"+c2.kind+ ","+c2.number+"이며 크기는"+c2.width+","+c2.height+"입니다.");
        c1.width=50;
        c1.height=80;
        System.out.println("c1은"+c1.kind+ ","+c1.number+"이며 크기는"+c1.width+","+c1.height+"입니다.");
        System.out.println("c2은"+c2.kind+ ","+c2.number+"이며 크기는"+c2.width+","+c2.height+"입니다.");
    }
}
