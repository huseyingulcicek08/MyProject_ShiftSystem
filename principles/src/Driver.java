public class Driver extends Employee{

    private String typeOfDrivingLicence;

    public Driver(String name, int age, String gender, String hoursOfWork, String typeOfDrivingLicence) {
        super(name, age, gender, hoursOfWork);
        this.typeOfDrivingLicence = typeOfDrivingLicence;
    }

    public String getTypeOfDrivingLicence() {
        return typeOfDrivingLicence;
    }

    public void setTypeOfDrivingLicence(String typeOfDrivingLicence) {
        this.typeOfDrivingLicence = typeOfDrivingLicence;
    }

    @Override
    public String ShowInformations() {
        return super.ShowInformations() + "\nType of Driving Licence : " + getTypeOfDrivingLicence();
    }

    @Override
    public String toString() {
        return super.toString() + "\nJob : Driver" + "\nType Of Driving Licence : " + getTypeOfDrivingLicence();
    }
}
