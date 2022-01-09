package JavaStandard7.practice;

public class StaticTest {
    public static int width = 200;
    public static int height = 120;

    static{ //클래스의 초기화 블럭
        // static변수의 복잡한 초기화 수행
    }
    public static int max(int a, int b){
        return a > b ? a : b;
    }
}
