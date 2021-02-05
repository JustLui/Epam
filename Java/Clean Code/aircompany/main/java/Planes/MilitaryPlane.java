package Planes;
import models.MilitaryType;
import java.util.Objects;

public class MilitaryPlane extends Plane{

    private final MilitaryType TYPE;

    public MilitaryPlane(String model, int maxSpeed, int maxFlightDistance, int maxLoadCapacity, MilitaryType type) {
        super(model, maxSpeed, maxFlightDistance, maxLoadCapacity);
        this.TYPE = type;
    }

    public MilitaryType getType() {
        return TYPE;
    }

    @Override
    public String toString() {
        return super.toString().replace("}",
                ", type=" + TYPE +
                        '}');
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof MilitaryPlane)) {
            return false;
        }
        if (!super.equals(object)) {
            return false;
        }

        MilitaryPlane militaryPlane = (MilitaryPlane) object;
        return TYPE == militaryPlane.TYPE;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), TYPE);
    }
}
