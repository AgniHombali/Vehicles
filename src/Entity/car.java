package entity;
import java.util.Objects;
public class Car extends Vehicle {
	private String company;
    private String varient;
    private String model;
    private String engineType;
    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getVarient() {
        return varient;
    }

    public void setVarient(String varient) {
        this.varient = varient;
    }
    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.varient = varient;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car)) return false;
        if (!super.equals(o)) return false;
        Car car1 = (Car) o;
        return  Objects.equals(model, car1.model) &&
                Objects.equals(company, car1.company) &&
                Objects.equals(varient, car1.varient) &&
                Objects.equals(engineType, car1.engineType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), company, model, varient,engineType);
    }


    @Override
    public String toString() {
        return "car{" +
                "Company='" + company + '\'' +
                ", Model=" + model +
                ", Varient='" + varient + '\'' +
                "Engine Type='" + engineType + '\'' +
                "} " + super.toString();
    }

}
