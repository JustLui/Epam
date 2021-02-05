package Planes;

import java.util.Objects;

abstract public class Plane {
    private final int MAX_SPEED;
    private final int MAX_FLIGHT_DISTANCE;
    private final int MAX_LOAD_CAPACITY;
    String model;

    public Plane(String model, int maxSpeed, int maxFlightDistance, int maxLoadCapacity) {
        this.model = model;
        this.MAX_SPEED = maxSpeed;
        this.MAX_FLIGHT_DISTANCE = maxFlightDistance;
        this.MAX_LOAD_CAPACITY = maxLoadCapacity;
    }

    public int getMaxSpeed() {
        return MAX_SPEED;
    }

    public int getMaxFlightDistance() {
        return MAX_FLIGHT_DISTANCE;
    }

    public int getMaxLoadCapacity() {
        return MAX_LOAD_CAPACITY;
    }

    @Override
    public String toString() {
        return "Plane{" +
                "model=" + model + '\'' +
                ", maxSpeed=" + MAX_SPEED +
                ", maxFlightDistance=" + MAX_FLIGHT_DISTANCE +
                ", maxLoadCapacity=" + MAX_LOAD_CAPACITY +
                '}';
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof Plane)) return false;
        Plane plane = (Plane) object;
        return MAX_SPEED == plane.MAX_SPEED &&
                MAX_FLIGHT_DISTANCE == plane.MAX_FLIGHT_DISTANCE &&
                MAX_LOAD_CAPACITY == plane.MAX_LOAD_CAPACITY &&
                Objects.equals(model, plane.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, MAX_SPEED, MAX_FLIGHT_DISTANCE, MAX_LOAD_CAPACITY);
    }
}
