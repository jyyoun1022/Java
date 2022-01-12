package LackJava.listAndArray;
import java.util.ArrayList;
//제네릭스를 이용하지 않았을 때
public class Practice2 {
    public static void main(String[] args) {
        ArrayList pitches = new ArrayList();
        pitches.add("138");
        pitches.add("129");
        pitches.add(13);

        String one = (String) pitches.get(0);
        String two = (String) pitches.get(1);

        System.out.println(pitches.get(2));

    }
}
