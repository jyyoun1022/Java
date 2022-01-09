package JavaStandard6;

public class ClassMethod {
    public int a, b;

    public int add(){   //인스턴스메서드(인스턴스변수사용)
        return a+b;
    }
    public static int times(int a,int b){   //클래스메서드(static메서드)
        return a * b;
    }
}
