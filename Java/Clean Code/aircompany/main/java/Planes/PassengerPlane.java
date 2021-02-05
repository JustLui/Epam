package Planes;

import java.util.Objects;

public class PassengerPlane extends Plane{
    private final int PASSENGER_CAPACITY;

    public PassengerPlane(String model, int maxSpeed, int maxFlightDistance, int maxLoadCapacity, int passengersCapacity) {
        super(model, maxSpeed, maxFlightDistance, maxLoadCapacity);
        this.PASSENGER_CAPACITY = passengersCapacity;
    }

    public int getPassengersCapacity() {
        return PASSENGER_CAPACITY;
    }

    @Override
    public String toString() {
        return "Plane{" +
                "model=" + model + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", maxFlightDistance=" + maxFlightDistance +
                ", maxLoadCapacity=" + maxLoadCapacity +
                ", passengersCapacity= " + PASSENGER_CAPACITY +
                "}";
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof PassengerPlane)) {
            return false;
        }
        if (!super.equals(object)) {
            return false;
        }

        PassengerPlane plane = (PassengerPlane) object;
        return PASSENGER_CAPACITY == plane.PASSENGER_CAPACITY;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), PASSENGER_CAPACITY);
    }
}
