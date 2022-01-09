package JavaStandard7.practice;

final class Singleton {
    private static Singleton s = new Singleton();
    //getInstance()에서 사용될 수 있도록 인스턴스가 미리 생성되어야 하므로 static 이어야 한다.

    private  Singleton(){}

    public static Singleton getInstance(){
        if(s==null){
            s = new Singleton();
        }
        return s;
    }
}
class SingletonTest{
    public static void main(String[] args) {
//        Singleton s = new Singleton(); //에러!
        Singleton s1 = Singleton.getInstance();
    }
}
