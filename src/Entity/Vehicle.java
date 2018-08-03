package entity;
import java.util.Objects;

public abstract class Vehicle {
    private String vehicleType;
    private String name;
    private String year;
    public String getType() {
        return vehicleType;
    }

    
    
    public void setType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Vehicle)) return false;
        Vehicle vehicle = (Vehicle) o;
        return Objects.equals(vehicleType, vehicle.vehicleType) &&
                Objects.equals(name, vehicle.name) && (Objects.equals(year, vehicle.year)) ;
    }

    @Override
    public int hashCode() {

        return Objects.hash(vehicleType, name,year);
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "Vehicle Type=" + vehicleType +
                ", Name='" + name + '\'' +
                "Year=" + year;
    }
}