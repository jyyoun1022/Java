package JavaStandard7.practice;

public abstract class Unit {
    public int x,y;
    public abstract void move(int x,int y);
    public void stop() {//현재위치에 정지
    }
         }
         class Marine extends Unit{
             @Override
             public void move(int x, int y) {//지정된 위치로 이동
             }
             public void stimPack(){//스팀팩을 사용한다.
             }
         }
         class Tank extends Unit{
             @Override
             public void move(int x, int y) {//지정된 위치로 이동
             }
             public  void changeMode(){//공격모드로 변환한다.
             }
         }
         class Dropship extends Unit{
             @Override
             public void move(int x, int y) {//지정된 위치로 이동
             }
             public void load(){//선택된 대상을 태운다.
             }
             public void unloda(){//선택된 대상을 내린다.
             }
         }
