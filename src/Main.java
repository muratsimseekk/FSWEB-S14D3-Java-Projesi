import com.workintech.model.Car;
import com.workintech.model.Ford;
import com.workintech.model.Holden;
import com.workintech.model.Mitsubishi;

public class Main {
    public static void main(String[] args) {

        Car mitsubishi1 = new Mitsubishi(2,"Colt");
        mitsubishi1.startEngine();
        mitsubishi1.accelerate();
        mitsubishi1.brake();
        System.out.println("*********************");

        Car holden1 = new Holden(8,"Commodore");
        holden1.startEngine();
        holden1.accelerate();
        holden1.brake();

        System.out.println("*********************");

        Car ford1 = new Ford(8,"Mustang");
        ford1.startEngine();
        ford1.accelerate();
        ford1.brake();
    }
}