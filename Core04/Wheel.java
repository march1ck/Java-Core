package Core04;

public class Wheel {

    private int counts;

    private String model;

    private int diameter;


    public Wheel(int counts, String model, int diameter) {
        this.counts = counts;
        this.model = model;
        this.diameter = diameter;
    }

    public void increaseCount(){
        System.out.println("count of wheels" + counts);
        if (this.counts < 3 ){
            System.out.println("oh no it`s unfair");
        }else{
            System.out.println("let`s fix it");
            this.counts += 1;
        }
    }

    public int getCounts() {
        return counts;
    }

    public void setCounts(int counts) {
        this.counts = counts;
    }


    public void setModel(String model) {
        this.model = model;
    }

    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    @Override
    public String toString() {
        return "Wheel{" +
                "counts=" + counts +
                ", model=" + model +
                ", diameter=" + diameter +
                '}';
    }
}
