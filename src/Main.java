import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Person p = new Person();
        p.setFirstName("Naglis");
        p.setLastName("Mockevičius");
        p.setGender(true);
        p.setBirthYear(1990);

        Person p2 = new Person();
        p2.setFirstName("Vilius");
        p2.setLastName("Jurginas");
        p2.setBirthYear(1994);
        p2.setGender(true);
        System.out.println( "hi");


        System.out.println(p.getFirstName());
        System.out.println(p2.getFirstName());
        System.out.println(p);
        System.out.println(p2);
        System.out.println(p.currentAge());
        System.out.println(p2.currentAge());

        Person p3 = new Person("Domas","Petrauskas",1992,true);
        System.out.println("----------------------------");
        ArrayList<Person> people = new ArrayList<>();
        people.add(p);
        people.add(p2);
        people.add(p3);
        people.get(0);
//        people.set(0,p2);
//        people.remove(0);
        people.size();
        for (int i = 0; i < people.size(); i++) {
            System.out.println(people.get(i));
        }

    }

}