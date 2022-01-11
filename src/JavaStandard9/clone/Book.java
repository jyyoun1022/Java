package JavaStandard9.clone;

public class Book implements Cloneable{
    //클론메서드를 추가하기 위해 클래스 선언부에 복사가 가능하다는 의미로 implements Clonable을 붙여준다.
    public String title;
    public String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    @Override
    public String toString() {
        return author + "," + title;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    //클론 메서드를 재정의하는데 따로 수정할 것은 없고 그대로 가져다 쓰면 됩니다.
}
