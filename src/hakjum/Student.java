package hakjum;

import java.util.ArrayList;

public class Student {
    private String studentName; //학생이름
    private int StudentNum; //학번
    private Subject majorSubject;   //필수 과목

    private ArrayList<Score> scoreList = new ArrayList<Score>();    //학생이 수강한 과목의 점수 리스트.

    public Student(String studentName, int studentNum, Subject majorSubject) {
        this.studentName = studentName;
        this.StudentNum = studentNum;
        this.majorSubject = majorSubject;
    }
    public void addSubjectScore(Score score){   //메서드가 호출되면 배열리스트에 추가된다.
        scoreList.add(score);
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getStudentNum() {
        return StudentNum;
    }

    public void setStudentNum(int studentNum) {
        StudentNum = studentNum;
    }

    public Subject getMajorSubject() {
        return majorSubject;
    }

    public void setMajorSubject(Subject majorSubject) {
        this.majorSubject = majorSubject;
    }

    public ArrayList<Score> getScoreList() {
        return scoreList;
    }

    public void setScoreList(ArrayList<Score> scoreList) {
        this.scoreList = scoreList;
    }
}
