package JavaStandard9.ToString;

public class Book {
    public String title;    //제목
    public String author;   //저자

    public Book(){}

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    @Override
    public String toString() {
        return author + "," + title;
    }
}
