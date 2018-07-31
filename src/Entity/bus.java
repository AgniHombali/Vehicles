package Entity;
import java.util.Objects;
public class bus extends Vehicle {
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
        bus bus1 = (bus) o;
        return year == bus1.year &&
                Objects.equals(Company, bus1.Company) &&
                Objects.equals(Varient, bus1.Varient);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), Company, year, Varient);
    }


    @Override
    public String toString() {
        return "bus{" +
                "Company='" + Company + '\'' +
                ", year=" + year +
                ", Varient='" + Varient + '\'' +
                "} " + super.toString();
    }

}
