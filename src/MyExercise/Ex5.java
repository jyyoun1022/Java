package MyExercise;

public class Ex5 {
    public static void main(String[] args) {
        String a ="a:b:c:d";

        System.out.println(a.replaceAll(":","#"));
        String[] temp = a.split(":");   //":"로 분리;
        String result = String.join("#",temp);  //"#"로 합친다.
        System.out.println(result);
        for(String s : temp){
            System.out.print(s);//abcd 출력
        }
    }
}
