package LackJava.listAndArray;
import java.util.ArrayList;

//제네릭스를 썻을 때
public class Practice3 {
    public static void main(String[] args) {
        ArrayList<String> pitches = new ArrayList<>();
        pitches.add("138");
        pitches.add("129");


        String one = pitches.get(0);  // 형 변환이 필요없다.
        String two = pitches.get(1);  // 형 변환이 필요없다.

    }
}
