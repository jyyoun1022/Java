package JavaStandard7.practice;

interface Repairable {
}
class UnitEx{
    int hitPoint;
    final int MAX_HP;
    UnitEx(int hp){
        MAX_HP =hp;
    }
}
class GrounUnit extends UnitEx{
    GrounUnit(int hp){
        super(hp);
    }
}
class AirUnit extends UnitEx{
    AirUnit(int hp){
        super(hp);
    }
}
class TankEx extends GrounUnit implements Repairable {
    TankEx() {
        super(150); //Tank의 HP는 150이다.
        hitPoint = MAX_HP;
    }
    @Override
    public String toString() {
        return "Tank";
    }
}
class MarineEx extends GrounUnit{
    MarineEx(){
        super(40);
        hitPoint = MAX_HP;
    }
}
class SCV extends GrounUnit implements Repairable{
    SCV(){
        super(60);
        hitPoint=MAX_HP;
    }
    void repair(Repairable r){
        if(r instanceof Unit){
            UnitEx u =(UnitEx) r;
            while(u.hitPoint != u.MAX_HP){
                u.hitPoint++;   //Unit의 HP를 증가시킨다.
            }
        }
    }
}
class RepairableTest{
    public static void main(String[] args) {
        TankEx tank = new TankEx();
        MarineEx marine = new MarineEx();
        SCV scv = new SCV();

        scv.repair(tank);   //SCV가 Tank를 수리한다.
//        scv.repair(marine);//Error;
    }
}