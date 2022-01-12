package LackJava.listAndArray;
import java.util.ArrayList;
import java.util.Arrays;
//String.join()메서드 활용
public class Practice6 {
    public static void main(String[] args) {
        ArrayList<String> pitches = new ArrayList<>(Arrays.asList("138", "129", "142"));
        String result = String.join(",", pitches);
        System.out.println(result);  // 138,129,142 출력
    }
}
