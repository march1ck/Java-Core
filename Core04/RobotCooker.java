package Core04;

public class RobotCooker extends Robot{

    private String name;

    private int numberOfOwners;

    private int age;

    private String owner;

    public RobotCooker(String name, int age, int numberOfOwners, String owner) {
        super(name, age);
        this.numberOfOwners = numberOfOwners;
        this.owner = owner;
    }

    @Override
    public void work() {
        System.out.println("Я RobotCooker - я просто готую");
    }

}
