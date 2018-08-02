package Entity;
import java.util.Objects;
public class Train extends Vehicle {
	private String company;
    private String typeOfTrain ;
    private String typeOfTrainEngine;

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getTypeOfTrain() {
        return typeOfTrain;
    }

    public void setTypeOfTrain(String typeOfTrain) {
        this.typeOfTrain = typeOfTrain;
    }

    public String getTypeOfTrainEngine() {
        return typeOfTrainEngine;
    }

    public void setTypeOfTrainEngine(String typeOfTrainEngine) {
        this.typeOfTrainEngine = typeOfTrainEngine;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Train)) return false;
        if (!super.equals(o)) return false;
        Train train1 = (Train) o;
        return  Objects.equals(company, train1.company) &&
                Objects.equals(typeOfTrain, train1.typeOfTrain) &&
                Objects.equals(typeOfTrainEngine, train1.typeOfTrainEngine);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), company, typeOfTrain, typeOfTrainEngine);
    }


    @Override
    public String toString() {
        return "train{" +
                "Company='" + company + '\'' +
                ", Type of Train=" + typeOfTrain + 
                ", Type of Train Engine='" + typeOfTrainEngine + '\'' +
                "} " + super.toString();
    }

}
