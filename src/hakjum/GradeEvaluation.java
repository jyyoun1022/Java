package hakjum;

public interface GradeEvaluation {
    public String getGrade(int point);  //점수가 있으면 그점수에 따른 학점을 문자열로 반환해준다.
    //필수과목과 일반과목으로 구분하여 학점을 산출해야 하기에 일반과목학점정책을 BasicEvaluation,필수과목학점정책을 MajotEvaluation 이라고 하겠습니다.
}
