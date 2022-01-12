//package LackJava.Programing;
//import java.util.Arrays;
//import java.util.stream.IntStream;
//import java.util.Comparator;
//
//public class StreamTest {
//    public static void main(String[] args) {
//        int [] data ={5, 6, 4, 2, 3, 1, 1, 2, 2, 4, 8};
//        IntStream result =Arrays.stream(data);
////                 .boxed()  // IntStream을 Stream<Integer>로 변경한다.
//                .filter((a) -> a % 2 == 0)  //  짝수만 걸러낸다.
//                .distinct()  // 중복을 제거한다.
//                .sorted(Comparator.reverseOrder())  // 역순으로 정렬한다.
//                .mapToInt(Integer::intValue)  // Stream<Integer>를 IntStream으로 변경한다.
//                .toArray()  // int[] 배열로 반환한다.
//    }
//}
