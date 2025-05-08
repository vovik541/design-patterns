package creational.builder.from_task_example.builders;


import creational.builder.from_task_example.cars.CarType;
import creational.builder.from_task_example.components.Engine;
import creational.builder.from_task_example.components.GPSNavigator;
import creational.builder.from_task_example.components.Transmission;
import creational.builder.from_task_example.components.TripComputer;

public interface Builder {
    void setCarType(CarType type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);
}
