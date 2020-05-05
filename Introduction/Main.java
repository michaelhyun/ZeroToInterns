package Introduction;

public class Main {


    public static void main(String[] args) {
        Student myStudent = new Student(18, "male", "Michael", true, 99.99);
        System.out.println(myStudent.getAge());
        myStudent.setAge(21);
        System.out.println("My student's age is: " + myStudent.getAge());

        Student mySecondStudent = new Student(18, "male", "Michael", true, 99.99);
        System.out.println("mike");

    }
}
