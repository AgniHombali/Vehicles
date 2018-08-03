package entity;
import java.util.Objects;
public class Plane extends Vehicle {
	private String company;
    private String typeOfPlane ;
    private String varient;

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getTypeOfPlane() {
        return typeOfPlane;
    }

    public void setTypeOfPlane(String typeOfPlane) {
        this.typeOfPlane = typeOfPlane;
    }

    public String getVarient() {
        return varient;
    }

    public void setVarient(String Varient) {
        this.varient = varient;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car)) return false;
        if (!super.equals(o)) return false;
        Plane plane1 = (Plane) o;
        return  Objects.equals(company, plane1.company) &&
                Objects.equals(typeOfPlane, plane1.typeOfPlane) &&
                Objects.equals(varient, plane1.varient);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), company, typeOfPlane, varient);
    }


    @Override
    public String toString() {
        return "plane{" +
                "Company='" + company + '\'' +
                ", Type of Plane=" + typeOfPlane +
                ", Varient='" + varient + '\'' +
                "} " + super.toString();
    }

}

