import java.util.List;
import java.util.PrimitiveIterator;

/**
 * Created by user on 04.07.2017.
 */
public class Person {
    private int age;
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {

        return name;
    }

    private int size;
    private int weight;
    private List<Car> ovnetCars;

    public void setOvnetCars(List<Car> ovnetCars) {
        this.ovnetCars = ovnetCars;
    }

    public List<Car> getOvnetCars() {

        return ovnetCars;
    }

    public int getAge() {
        return age;
    }

    public int getSize() {
        return size;
    }

    public int getWeight() {
        return weight;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }


    public void scream(String message){
        System.out.println(message);
    }

    public void laugh(){
        System.out.println("hahahaha");
    }
}
