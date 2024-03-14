package Task3;

public class Person {
    private String name;
    boolean addCourse;


    public Person(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(){}

    public boolean addCourse(String course){
        return true;
    }
}
 /*3.1 Lav en klasse Person, med feltet name.
     Lav også en konstruktør og relevant getter- og setter-metode.
Lav derudover metoden boolean addCourse(String course). Metoden skal ikke gøre noget, så du kan lade den
returnere true og ikke gøre andet (en dummy-metode).*/