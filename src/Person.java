/**
 * Created by user on 04.07.2017.
 */
public class Person {
    private int age;
    private int size;
    private int weight;

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
