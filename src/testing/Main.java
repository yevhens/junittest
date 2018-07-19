package testing;

public class Main {

    public static void main(String[] args) {

        Entity john=new Entity("john",55,1,true);
        john.doesnotlikehotdogs();
        john.changeAge(12);
        System.out.println(john.toString());

    }



}

