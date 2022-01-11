package JavaStandard9.hashCdoe;

public class Student {

    public int studentNum;
    public String studentName;

    public Student(int studentNum, String studentName) {
        this.studentNum = studentNum;
        this.studentName = studentName;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof JavaStandard9.equals.Student) {  //참조변수 obj, 타입(클래스명)Student(피연산자)
            Student std = (Student) obj; //Object클래스로 업캐스팅된것을 다운캐스팅
            return (this.studentName == std.studentName);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return studentNum;
    }
}