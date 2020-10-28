package Core04;

public class Main {
    public static void main(String[] args) {
        System.out.println("Перше завдання");
        Robot robot = new Robot("Teo", 15);
        robot.work();
        CoffeeRobot coffeeRobot = new CoffeeRobot("Fenix.com", 52, "Fivox");
        coffeeRobot.work();
        RobotDancer robotDancer = new RobotDancer(5, "Tirex");
        robotDancer.work();
        RobotCooker robotCooker = new RobotCooker("Menix", 4, 6, "Duckson");
        robotCooker.work();

        System.out.println("Друге завдання");

        Robot[] robots = new Robot[3];
        robots[0] = coffeeRobot;
        robots[1] = robotDancer;
        robots[2] = robotCooker;

        for (int i = 0; i < robots.length;i++){
            robots[i].work();
        }

        Cab cab1 = new Cab("Black" , "Кабріолет");
        Wheel wheel1 = new Wheel(2 , "ttr5", 25);
        Helm helm1 = new Helm("leftSide" , 60 , true);

        Car car = new Car("X6" , 2015 , wheel1 ,cab1, helm1);
        car.startCreate();


        Animal animal = new Animal("Леопард" , 45, 7);

        System.out.println("Animal name: " + animal.getName() + " Velocity: " + animal.getVelocity() + " km/h" + " Age: " + animal.getAge() + " year");

        animal.setName("Бик");
        animal.setVelocity(15);
        animal.setAge(5);

        System.out.println("Animal name: " + animal.getName() + " Velocity: " + animal.getVelocity()+ " km/h" + " Age: " + animal.getAge() + " year");

    }
}

