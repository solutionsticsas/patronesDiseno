package creacion.builder;

import creacion.builder.cars.CarType;
import creacion.builder.components.Engine;
import creacion.builder.components.GPSNavigator;
import creacion.builder.components.Transmission;
import creacion.builder.components.TripComputer;

/**
 * Builder interface defines all possible ways to configure a product.
 */
public interface Builder {
    void setCarType(CarType type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);
}