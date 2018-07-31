package Entity;
import java.util.Objects;
public class plane extends Vehicle {
	private String Company;
    private int year ;
    private String Varient;

    public String getCompany() {
        return Company;
    }

    public void setCompany(String Company) {
        this.Company = Company;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getVarient() {
        return Varient;
    }

    public void setVarient(String Varient) {
        this.Varient = Varient;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof car)) return false;
        if (!super.equals(o)) return false;
        plane plane1 = (plane) o;
        return year == plane1.year &&
                Objects.equals(Company, plane1.Company) &&
                Objects.equals(Varient, plane1.Varient);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), Company, year, Varient);
    }


    @Override
    public String toString() {
        return "plane{" +
                "Company='" + Company + '\'' +
                ", year=" + year +
                ", Varient='" + Varient + '\'' +
                "} " + super.toString();
    }

}

