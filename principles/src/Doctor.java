public class Doctor extends Employee {

    private String profession;

    public Doctor(String name, int age, String gender, String hoursOfWork, String profession) {
        super(name, age, gender, hoursOfWork);
        this.profession = profession;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    @Override
    public String ShowInformations() {
        return super.ShowInformations() + "\nProfession : " + getProfession();
    }

    @Override
    public String toString() {
        return super.toString() + "\nJob : Doctor" + "\nProfession : " + getProfession();
    }
}
