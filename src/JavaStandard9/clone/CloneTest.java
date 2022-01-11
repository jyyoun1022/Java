package JavaStandard9.clone;

public class CloneTest {
    public static void main(String[] args) throws CloneNotSupportedException{
        Book book = new Book("토지","박경리");

        System.out.println(book);   //박경리, 토지

        Book book2 =(Book)book.clone();
        //book의 복사본을 만들기 위해 book2에 book.clone()메서드를 사용해주고 앞에 (Book)타입을 명시해준다.
        System.out.println(book2);  //박경리, 토지
    }
}
