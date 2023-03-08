package Clone;

public class Main {
    public static void main(String[] args) {
        PersonInfo p1 = new PersonInfo("Ahmad",19,"35202");
        System.out.println("This is Person 1:  "+p1.toString());
        PersonInfo p2 = p1.clone(); //
        //PersonInfo p2 = p1; //This will make a shallow copy which means if you change in p2 it will reflect in p1 also
        System.out.println("This is Person 2:  "+p2.toString());
        p2.name = "ali";
        System.out.println("This is Person 1:  "+p1.toString());
    }
}
