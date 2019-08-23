package lesson02;
class Person{

    private String firstName;
    private String secondName;
    private int age;
    private static int count =0;

    public String getFirstName(){
        return firstName;
    }

    public String getSecondName(){
        return secondName;
    }
    public int getAge(){
        return age;
    }

    private void setSecondName(String secondName){
        this.secondName = secondName;
    }
    private void setFirstName(String firstName){
        this.firstName = firstName;
    }
    private void setAge(int age){
        this.age = age;
    }

    Person(String firstName, String secondName, int age){
        setFirstName();
        setSecondName();
        setAge();
        count++;
    }
    /*void doSomething(){
        String end = " is doing something.";
        System.out.println(firstName + " " + secondName + end);
    }*/
    static {
        System.out.println("First class loading.");
    }
    {
        System.out.println(count + " class loading.");
    }

    }

    public static void main(String[] args){
        Person p1 = new Person("Bill", "Gates", 63);
        Person p2 = new Person("Bill", "Gates", 63);
        Person p3 = new Person("Larry", "Page", 46);

        int hCode1;
        hCode1 = p1.hasCode();
        System.out.println("HasCode of p1 :" + hCode1);

        int hCode2;
        hCode2 = p2.hasCode();
        System.out.println("HasCode of p2 :" + hCode2);

        if p1.equals(p2) = true{
            System.out.println("p1 and p2 are equal");
        }
        else
            System.out.println("p1 and p2 are not equal")



        System.out.println("p1.toString :" + p1.toString());

    }




}