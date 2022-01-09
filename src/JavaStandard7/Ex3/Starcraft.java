package JavaStandard7.Ex3;
class Marine{   //마린 클래스
    public String name;
    public int hp;

    public Marine(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }
    public void stimpack(){ //메서드
        System.out.print("[" + name + "]" + "의 스팀팩!" + "    hp:" + hp);
        hp -=10;
        System.out.println("->"+hp);
    }
}
class Medic{    //메딕 클래스
    public String name;
    public int hp;

    public Medic(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }
    public  void heal(Marine target){   //힐 메서드
        System.out.print("[" + name + "]" + "의 치유!    " + target.name+"hp: " + target.hp);
        target.hp += 10;
        System.out.println("->" + target.hp);


    }
}
public class Starcraft {
    public static void main(String[] args) {
        //객체 생성
        Marine marine = new Marine("마린",80);
        Medic medic = new Medic("메딕",60);

        marine.stimpack();  //마린 스팀팩 버프
        medic.heal(marine); //메딕의 치료 -> 마린

    }
}
