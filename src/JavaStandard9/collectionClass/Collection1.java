package JavaStandard9.collectionClass;

import java.util.ArrayList;

public class Collection1 {
    public static void main(String[] args) {
        ArrayList<String> arrList = new ArrayList<String>();    //리스트생성

        arrList.add("넷");   //리스트에 요소에 저장
        arrList.add("둘");
        arrList.add("셋");
        arrList.add("하나");

        for (int i = 0; i < arrList.size(); i++) {  //리스트 요소의 출력
            System.out.println(arrList.get(i)); //넷,둘,셋,하나
        }
    }
}
