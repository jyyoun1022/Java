package Lab.ArrayTest;

class Person{
    private String names;
    private int age;

    public Person(){}
    public Person(String names, int age) {
        this.names = names;
        this.age = age;
    }

    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names = names;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

public class ArrayEx {
    public static void main(String[] args) {
        //객체 생성
        int[] arr1 ={1,2,3,4,5};
        char[] arr2 = {'A','B','C','D','E'};
        Person[] arr3 = new Person[5];
        arr3[0]=new Person("홍길동",20);
        arr3[1]=new Person("홍길동",20);
        arr3[2]=new Person("홍길동",20);
        arr3[3]=new Person("홍길동",20);
        arr3[4]=new Person("홍길동",20);

        //출력
        for(int i =0; i<arr1.length; i++){
            System.out.print(arr1[i] +" ");
        }
        System.out.println();

        for(int i=0; i<arr3.length; i++){
            System.out.print(arr3[i].getNames()+" ");
        }
        System.out.println();
    }

}
