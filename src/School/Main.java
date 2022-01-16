package School;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Student st1 = new Student("윤재열", "01045232891");
        Student st2 = new Student("형욱님", "01047422891");
        Student st3 = new Student("마린보이", "01012342891");

        ArrayList<Student> studentList = new ArrayList<>();
        studentList.add(st1);
        studentList.add(st2);
        studentList.add(st3);


        while (true) {
            System.out.println("*학생을 검색하려면 '1' 을 입력해주세요.*");
            System.out.println("*학생을 추가하려면 '2' 를 입력해주세요.*");
            System.out.println("*종료하려면 '3' 를 입력해주세요.*");
            String input = scan.next();
            if (input.equals("1")) {
                System.out.println("검색하고자 하는 이름을 입력하세요");
                String whatName = scan.next();
                for (Student s : studentList) {
                    if (s.getStudentName().equals(whatName)) {
                        System.out.println("[" + s.getStudentName() + " 님의 휴대폰 번호는 " + s.getPhoneNumber() +" 입니다.]");
                    } else {

                    }
                }

            } else if (input.equals("2")) {
                System.out.println("학생을 학생부에 추가하겠습니다.");
                System.out.println();
                System.out.println("학생의 이름을 입력해주세요");
                String newName = scan.next();
                System.out.println("학생의 휴대폰 번호를 입력해주세요");
                String newNum = scan.next();
                System.out.println("학생이 추가되었습니다.");
                System.out.println();
                Student newStudent = new Student(newName, newNum);
                studentList.add(newStudent);
            } else if (input.equals("3")) {
                System.out.println("종료되었습니다.");
                break;
            } else {
                System.out.println("아니 1,2,3번중에 입력하라니까?");
                continue;
            }

        }
    }
}

