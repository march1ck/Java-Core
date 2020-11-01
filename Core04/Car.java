package Core04;

public class Car {

    private String model;

    private int createYear;

    private Wheel wheel;

    private Cab cab;

    private Helm helm;

    public void startCreate(){
        System.out.println("Everything done !!!");
    }


    public Car(String model, int createYear, Wheel wheel, Cab cab, Helm helm) {
        this.model = model;
        this.createYear = createYear;
        this.wheel = wheel;
        this.cab = cab;
        this.helm = helm;
    }

    public Car() {
        this.model = "A5";
        this.createYear = 2019;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getCreateYear() {
        return createYear;
    }

    public void setCreateYear(int createYear) {
        this.createYear = createYear;
    }

    public Wheel getWheel() {
        return wheel;
    }

    public void setWheel(Wheel wheel) {
        this.wheel = wheel;
    }

    public Cab getCab() {
        return cab;
    }

    public void setCab(Cab cab) {
        this.cab = cab;
    }

    public Helm getHelm() {
        return helm;
    }

    public void setHelm(Helm helm) {
        this.helm = helm;
    }

    @Override
    public String toString() {
        return String.format("model" + model);
    }
}
