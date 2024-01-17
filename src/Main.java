import com.workintech.model.Car;
import com.workintech.model.Ford;
import com.workintech.model.Holden;
import com.workintech.model.Mitsubishi;
import com.workintech.model.carcompany.CarSkeleton;
import com.workintech.model.carcompany.ElectricCar;
import com.workintech.model.carcompany.GasPoweredCar;
import com.workintech.model.carcompany.HybridCar;

public class Main {
    public static void main(String[] args) {

        Car mitsubishi1 = new Mitsubishi(2,"Colt");
        mitsubishi1.startEngine();
        mitsubishi1.accelerate();
        mitsubishi1.brake();

        ((Mitsubishi)mitsubishi1).justMitsubishi();
        System.out.println("*********************");

        Car holden1 = new Holden(8,"Commodore");
        holden1.startEngine();
        holden1.accelerate();
        holden1.brake();

        //ClassCastException hatasi verir sebebi siblinglerden cagirilamaz //
        //((Mitsubishi)holden1).justMitsubishi();
        System.out.println("*********************");

        Car ford1 = new Ford(8,"Mustang");
        ford1.startEngine();
        ford1.accelerate();
        ford1.brake();

        System.out.println("*********************");

        CarSkeleton gasCar = new GasPoweredCar("Renault" ,"1.5 petrol" ,6.4,4);
        CarSkeleton electricCar = new ElectricCar("Tesla" ,"S series" ,530 ,72);
        CarSkeleton hybridCar = new HybridCar("Toyota","Camry",4.4,24,6);

        test(gasCar);
        test(electricCar);
        test(hybridCar);
    }
    public static void test(CarSkeleton car){
        car.startEngine();
        car.drive();
        System.out.println("Car Type: " + car.getClass().getSimpleName());
        System.out.println("-----------------------");
    }
}