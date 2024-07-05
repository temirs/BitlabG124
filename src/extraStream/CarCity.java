package extraStream;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class CarCity {
    private ArrayList<Car> cars = new ArrayList<>();

    public CarCity() {
    }

    public CarCity(ArrayList<Car> cars) {
        this.cars = cars;
    }

    void addCar(Car car) {
        cars.add(car);
    }

    Car firstGreatVolumeCar() {
        return cars.stream().filter(s -> s.getEngineVolume() > 3.0).findFirst().orElseThrow();
    }

    ArrayList<Car> search(String name) {
        return (ArrayList<Car>) cars.stream().filter(s-> name.equals(s.getName())).collect(Collectors.toList());
    }

    ArrayList<Car> filterCars(
            int fromSpeed, int toSpeed, double fromVolume, double toVolume
    ) {
        return (ArrayList<Car>) cars.stream().filter(s -> s.getMaxSpeed() >= fromSpeed && s.getMaxSpeed() <= toSpeed)
                .filter(s -> s.getEngineVolume() >= fromVolume && s.getEngineVolume() <= toVolume).collect(Collectors.toList());
    }
}
