package Entity;
import java.util.Objects;

public abstract class Vehicle {
    private long VehicleType;
    private String Name;

    public long getType() {
        return VehicleType;
    }

    public void setType(long VehicleType) {
        this.VehicleType = VehicleType;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Vehicle)) return false;
        Vehicle vehicle = (Vehicle) o;
        return VehicleType == vehicle.VehicleType &&
                Objects.equals(Name, vehicle.Name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(VehicleType, Name);
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "Vehicle Type=" + VehicleType +
                ", Name='" + Name + '\'' +
                '}';
    }
}