public class Employee {

    private String name;
    private int age;
    private String gender;
    private String hoursOfWork;

    public Employee(String name, int age, String gender, String hoursOfWork) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.hoursOfWork = hoursOfWork;
    }

    public String ShowInformations(){

        return "Name : " + getName() +
                "\nAge : " + getAge() +
                "\nGender : " + getGender() +
                "\nHours of Work : " + getHoursOfWork();
    }

    @Override
    public String toString() {
        return "Name : " + getName() +
                "\nAge : " + getAge() +
                "\nGender : " + getGender();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getHoursOfWork() {
        return hoursOfWork;
    }

    public void setHoursOfWork(String hoursOfWork) {
        this.hoursOfWork = hoursOfWork;
    }


}
