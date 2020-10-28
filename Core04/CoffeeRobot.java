package Core04;

public class CoffeeRobot extends Robot {

    private String owner;

    private int age;

    private String name;

    public CoffeeRobot(String name, int age, String owner) {
        super(name, age);
        this.owner = owner;

    }

    @Override
    public void work() {
        System.out.println("Я CoffeeRobot - я варю каву");
    }

}

