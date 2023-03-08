package Clone;

public class PersonInfo {
    String name;
    int age;
    String id;


    PersonInfo(String name, int age, String id){
        this.name = name;
        this.age = age;
        this.id = id;
    }
    @Override
    public String toString() {
        return "PersonInfo{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", id='" + id + '\'' +
                '}';
    }
    @Override
    public PersonInfo clone(){
        return new PersonInfo(this.name, this.age, this.id);
    }
}
