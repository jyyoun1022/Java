package LackJava.String;

import groovy.json.JsonOutput;

public class splitAndJoin {
    public static void main(String[] args) {
        String myNumber = "010-4623-2891";

        String[] myPhone = myNumber.split("-");
        String result = String.join("@", myPhone);
        System.out.println(result);
        for(String s : myPhone){
            System.out.println(s);


            System.out.println(String.join("@","010","4623","2891"));
            String result2 = String.join("@",myPhone);
            System.out.println(result2);
        }


    }
}
