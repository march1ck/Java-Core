package Core04;

public class Animal {
    private String name;

    private int velocity;

    private int age;

    public Animal(String name, int velocity, int age) {
        this.name = name;
        this.velocity = velocity;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVelocity() {
        return velocity;
    }

    public void setVelocity(int velocity) {
        this.velocity = velocity;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
