/**
 * Created by user on 04.07.2017.
 */
public class Car {
    private int horsePover;
    private int wheelCount;
    private Person ovner;

    public int getHorsePover() {
        return horsePover;
    }

    public int getWheelCount() {
        return wheelCount;
    }

    public Person getOvner() {
        return ovner;
    }

    public void setHorsePover(int horsePover) {
        this.horsePover = horsePover;
    }

    public void setWheelCount(int wheelCount) {
        this.wheelCount = wheelCount;
    }

    public void setOvner(Person ovner) {
        this.ovner = ovner;
    }
}
