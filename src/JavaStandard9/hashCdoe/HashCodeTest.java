package JavaStandard9.hashCdoe;

public class HashCodeTest {
    public static void main(String[] args) {
        Student Lee = new Student(100, "이순신");
        Student Shin = new Student(100, "이순신");

        System.out.println(Lee.hashCode()); // 100
        System.out.println(Shin.hashCode()); // 100
        //hashCode 는 Student 클래스에서 studenNum을로 재정의 했다.

        System.out.println(System.identityHashCode(Lee)); //423031029
        System.out.println(System.identityHashCode(Shin)); //1712669532
        // hascode()값이 궁금하다면 System.identityHashCode()메서드를 사용
    }
}
