package MyExercise;
import java.util.Scanner;

public class Ex2 {
    public int m;   //게시물의 총 건수
    public int n;   //페이지당 게시물의 건수

    public Ex2(int m, int n) {
        this.m = m;
        this.n = n;
    }

    public Ex2() {
    }
    public int getTotalPage() {
        if (m % n == 0) {
            return m / n;
        }
        return m / n + 1;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("게시물의 총 건수를 입력하세요");
        int post = sc.nextInt();
        System.out.println("한페이지당 보여줄 게시물 건수를 입력하세요.");
        int page = sc.nextInt();

        Ex2 ex = new Ex2(post,page);
        System.out.println(ex.getTotalPage());
    }
    }

