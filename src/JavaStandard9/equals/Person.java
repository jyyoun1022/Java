package JavaStandard9.equals;

public class Person {
    public long id;

    public boolean equals(Object obj){
        if(obj ==null && obj instanceof Person){
            return id ==((Person)obj).id;   //obj가 object타입이므로 id값을 참조하기 위해서는 person타입으로 형변환이 필요하다.
        }else{
            return false;   //타입이 person이 아니면 값을 빅할 필요도 없다.
        }
    }
    Person(long id){
        this.id=id;
    }
}