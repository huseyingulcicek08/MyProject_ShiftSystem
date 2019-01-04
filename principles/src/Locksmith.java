public class Locksmith extends Employee{

    public Locksmith(String name, int age, String gender, String hoursOfWork) {
        super(name, age, gender, hoursOfWork);
    }

    @Override
    public String ShowInformations() {
        return super.ShowInformations();
    }

    @Override
    public String toString() {
        return super.toString() + "\nJob : Locksmith";
    }
}
