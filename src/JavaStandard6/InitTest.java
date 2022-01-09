package JavaStandard6;

public class InitTest {
    public int x;   //인스턴스변수 2개
    public int y=x;

    public void method(){
        int i;  //지역변수
//        int j=i;    //컴파일에러! 지역변수를 초기화 하지 않고 사용했다.
    }
}
