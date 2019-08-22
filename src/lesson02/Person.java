package lesson02;
class Person{

    private String firstName;
    private String secondName;
    private int age;
    private static int count =0;

    Person(String firstName, String secondName, int age){
        this.firstName = firstName;
        this.secondName = secondName;
        this.age = age;
        count++;
    }
    void doSomething(){
        String end = " is doing something.";
        System.out.println(firstName + " " + secondName + end);
    }
    static {
        System.out.println("First class loading.");
    }
    {
        System.out.println(count + " class loading.");
    }

    }

    public static void main(String[] args){
        //Person p1 = new Person("Bill", "Gates", 50);
        //Person p2 = new Person("Bill", "Gates", 50);
        //Person p3 = new Person("Steve", "Jobs", 50);
    }




}