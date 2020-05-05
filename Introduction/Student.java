package Introduction;

public class Student {
    private int age;
    private String gender;
    private String name;
    private boolean goodStanding;
    private double grade;

    public Student(int age, String gender, String name, boolean goodStanding, double grade) {
        this.age = age;
        this.gender = gender;
        this.name = name;
        this.goodStanding = goodStanding;
        this.grade = grade;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return this.gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setGoodStanding(boolean goodStanding) {
        this.goodStanding = goodStanding;
    }

    public boolean getGoodStanding() {
        return this.goodStanding;
    }

    public void setGrade(double grade) {
        this.age = age;
    }

    public double getGrade() {
        return this.grade;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }
}
