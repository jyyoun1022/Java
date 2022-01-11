package MyExercise;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex3 {
    public int n;

    public Ex3(int n) {
        this.n = n;
    }

    public static int numberNum(int n){ //만약여기에 throws가 걸렸으면 sout문에서 트라이,캐치를 해야하냐?
        int count=0;
        while(true){
            if(n == 0){
                break;
            }
            n /= 10;
            count++;
        }
        return count;

    }
    public static void main(String[] args) throws InputMismatchException {
        Scanner sc=new Scanner(System.in);
        System.out.println("양의 정수를 입력하세요.");

        try {
            int number = sc.nextInt();
            System.out.println("입력하신 정수의 자릿수는 : " + numberNum(number));
        }catch(InputMismatchException e){
            System.out.println("정수로만 입력하라고 했잖아요..");
        }
    }
    }

