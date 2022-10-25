package Birthday_Program;
public class PersonTester {
    public static void main(String[] args) {
        //create an instance of the Person class
        Person person = new Person();
        System.out.println("The probability that two people in the class are sharing the same birthday is: " + person.sharedBirthday());
    }
}
