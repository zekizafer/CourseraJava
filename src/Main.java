import com.sun.corba.se.impl.protocol.giopmsgheaders.CancelRequestMessage_1_0;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        Person zeki = new Person();
        zeki.setName("zekizafer");
        zeki.setAge(17);
        System.out.println(zeki.getAge());
        zeki.setSize(2);
        zeki.setWeight(80);

        zeki.scream("I am screaming right now");
        zeki.laugh();
        Car car1 = new Car();
        Car car2 = new Car();
        Car car3 = new Car();
        car1.setHorsePover(100);
        car2.setHorsePover(150);
        car3.setHorsePover(200);
        car1.setWheelCount(4);
        car2.setWheelCount(145);
        car3.setWheelCount(200);

        List<Car> zekisCars = new ArrayList<>();

        zekisCars.add(car1);
        zekisCars.add(car2);
        zekisCars.add(car3);

        zeki.setOvnetCars(zekisCars);

        car1.setOvner(zeki);
        car2.setOvner(zeki);
        car3.setOvner(zeki);


        System.out.println(car1.getOvner().getName());
        System.out.println(car2.getOvner().getName());
        System.out.println(car3.getOvner().getName());




    }
}
