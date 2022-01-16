package hakjum;

import java.util.ArrayList;
import hakjum.Define;

public class Subject {
    private String subjectName; //과목 이름
    private int subjectId;  //과목 고유 번호
    private int gradeType;  //과목 평가 방법 기본은 A,B 방식
    private ArrayList<Student> studentList = new ArrayList<>(); //이 과목을 수강 신청한 학생리스트

    public Subject(String subjectName, int subjectId, int gradeType) {
        this.subjectName = subjectName;
        this.subjectId = subjectId;
        this.gradeType = Define.AB_TYPE;    //기본으로는 A,B 방식을 사용한다.
    }

    public void addSubjectStudent(Student student){
        studentList.add(student);
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public int getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(int subjectId) {
        this.subjectId = subjectId;
    }

    public int getGradeType() {
        return gradeType;
    }

    public void setGradeType(int gradeType) {
        this.gradeType = gradeType;
    }

    public ArrayList<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(ArrayList<Student> studentList) {
        this.studentList = studentList;
    }
}
