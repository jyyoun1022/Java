package JavaStandard9.collectionClass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Collection2 {
    public static void main(String[] args) {
        ArrayList<Integer> arrList = new ArrayList<Integer>();

        //add()메서드를 이요한 요소의 저장
        arrList.add(40);;
        arrList.add(20);
        arrList.add(30);
        arrList.add(10);

        //for문과 get() 메서드를 이용한 요소의 출력
        for(int i =0; i< arrList.size(); i++){
            System.out.print(arrList.get(i)+ " ");
        }
        System.out.println();
        //remove()메서드를 이용한 요소의 제거
        arrList.remove(1);

        //향상된 for문과 get() 메서드를 이용한 요소의 출력
        for(int e : arrList){
            System.out.print(e + " ");
        }
        System.out.println();
        //Collections.sort()메서드를 이요한 요소의 출력
        Collections.sort(arrList);
        //iterator() 메서드와 get()메서드를 이용한 요소의 출력
        Iterator<Integer> iter = arrList.iterator();
        while(iter.hasNext()){
            System.out.print(iter.next() +" ");
        }
        System.out.println();
        // set() 메소드를 이용한 요소의 변경
        arrList.set(0, 20);

        for (int e : arrList) {
            System.out.print(e + " ");
        }
        System.out.println();
        // size() 메소드를 이용한 요소의 총 개수
        System.out.println("리스트의 크기 : " + arrList.size());
         }
}
