package JavaStandard9;

public class Person {
    public long id;

    public boolean equals(Object obj){
        if(obj ==null && obj instanceof Person){
            return id ==((Person)obj).id;
        }else{
            return false;
        }
    }
    Person(long id){
        this.id=id;
    }
}
