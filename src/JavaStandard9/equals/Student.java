package JavaStandard9.equals;

public class Student {
    public int studentNum;
    public String studentName;

    public Student(int studentNum, String studentName) {
        this.studentNum = studentNum;
        this.studentName = studentName;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Student) {  //참조변수 obj, 타입(클래스명)Student(피연산자)
            Student std = (Student) obj; //Object클래스로 업캐스팅된것을 다운캐스팅
            return (this.studentName == std.studentName);
        }
        return false;
    }
}
//Object obj = new Student  //업캐스팅. obj는 스튜턴트 객체를 가지지만,object의 멤버,변수만쓸수있다.
//Student student =(Student)obj //다운 캐스팅. student는 다쓸수 있다.
//if(obj instanceof Student)