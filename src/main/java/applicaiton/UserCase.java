package applicaiton;

import com.javafx.tools.doclets.formats.html.SourceToHTMLConverter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by huzhen on 2017/12/8.
 */
public class UserCase {

    public static void main(String[] args) {
        Person p1 = new Person("lisi","male",2);
        Person p2 = new Person(p1);
        System.out.println(p1 == p2);
        System.out.println(p1);
        System.out.println(p2);
        Asian a1 = new Asian("yellow",p1);
        Asian a2 = new Asian(a1);
        System.out.println("---------");
        System.out.println(a1 == a2);
        System.out.println(a1);
        System.out.println(a2);
        a2.skin = "y";
        System.out.println("---------");
        System.out.println(a1 == a2);
        System.out.println(a1);
        System.out.println(a2);
        a2.person = p2;
        System.out.println("---------");
        System.out.println(a1 == a2);
        System.out.println(a1);
        System.out.println(a2);


    }

}

class Person{
    private String name;
    private String sex;
    private int age;
    private List source = new ArrayList();

    public Person(String name, String sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public Person(Person p) {
        this.name = p.name;
        this.sex = p.sex;
        this.age = p.age;
    }

    void doTestFor(){

        for (int i = 0;i < 1000;i++){
            source.add(i);
        }
    }

}

class Asian{
    String skin;
    Person person;

    public Asian(String skin, Person person) {
        this.skin = skin;
        this.person = person;
    }

    public Asian(Asian a) {
        this(a.skin,a.person);
    }


}