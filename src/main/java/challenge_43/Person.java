package challenge_43;

public class Person {

    public Person(String name, int age, int heightInCm) {
        Name = name;
        this.age = age;
        HeightInCm = heightInCm;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHeightInCm() {
        return HeightInCm;
    }

    public void setHeightInCm(int heightInCm) {
        HeightInCm = heightInCm;
    }

    private String Name;
    private int age;
    private int HeightInCm;
}
