package Core04;

public class Helm {

    private String location ;

    private int width;

    private boolean isHydraulic;

    public Helm(String location, int width, boolean isHydraulic) {
        this.location = location;
        this.width = width;
        this.isHydraulic = isHydraulic;
    }
    public void decreaseWidth(){
        width/=2;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public boolean isHydraulic() {
        return isHydraulic;
    }

    public void setHydraulic(boolean hydraulic) {
        isHydraulic = hydraulic;
    }

    @Override
    public String toString() {
        return "Helm{" +
                "location='" + location + '\'' +
                ", width=" + width +
                ", isHydraulic=" + isHydraulic +
                '}';
    }
}
