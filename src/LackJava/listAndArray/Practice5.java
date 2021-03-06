package LackJava.listAndArray;
import java.util.Arrays;
import java.util.ArrayList;

public class Practice5 {
    public static void main(String[] args) {
        ArrayList<String> pitches = new ArrayList<>(Arrays.asList("138", "129", "142"));
        String result = "";
        for (int i = 0; i < pitches.size(); i++) {
            result += pitches.get(i) + ","; // 콤마를 추가한다.
        }
        result = result.substring(0, result.length() -1);  // 마지막 콤마는 제거한다.

        System.out.println(result);  // 138,129,142 출력
    }
}

