package Core04;

public class RobotDancer extends Robot {

    private int numberOfLegs;

    private String name;



    public RobotDancer(int age, String name) {
        super(name, age);
        this.numberOfLegs = numberOfLegs;
    }

    @Override
    public void work() {
        System.out.println("Я RobotDancer - я просто танцюю");
    }

}
