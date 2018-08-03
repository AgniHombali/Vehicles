package entity;
import java.util.Objects;
public class Bus extends Vehicle {
	private String company;
    private String typeOfBus ;
    private String typeOfEngine;

    public String getCompany() {
        return company;
    }
    public void setCompany(String company) {
        this.company = company;
    }
    public String getTypeOfBus() {
        return typeOfBus;
    }
    public void setTypeOfBus(String typeOfBus) {
        this.typeOfBus = typeOfBus;
    }
    public String getTypeOfEngine() {
        return typeOfEngine;
    }
    public void setTypeOfEngine(String typeOfEngine) {
        this.typeOfEngine = typeOfEngine;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car)) return false;
        if (!super.equals(o)) return false;
        Bus bus1 = (Bus) o;
        return  Objects.equals(company, bus1.company) &&
                Objects.equals(typeOfBus, bus1.typeOfBus) &&
                Objects.equals(typeOfEngine, bus1.typeOfEngine);
    }
    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), company, typeOfBus, typeOfEngine);
    }


    @Override
    public String toString() {
        return "bus{" +
                "Company='" + company + '\'' +
                " Type of Bus=" + typeOfBus +
                " Type of Engine='" + typeOfEngine + '\'' +
                "} " + super.toString();
    }

}
