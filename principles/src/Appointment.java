import java.lang.reflect.Array;
import java.util.ArrayList;

public class Appointment {

    private static ArrayList<Employee> appointments = new ArrayList<Employee>();
    private static ArrayList<String> appointmentTime = new ArrayList<String>();

    public static ArrayList<Employee> getAppointments() {
        return appointments;
    }

    public static void setAppointments(ArrayList<Employee> appointments) {
        Appointment.appointments = appointments;
    }

    public static ArrayList<String> getAppointmentTime() {
        return appointmentTime;
    }

    public static void setAppointmentTime(ArrayList<String> appointmentTime) {
        Appointment.appointmentTime = appointmentTime;
    }

    public void saveAppointment(Employee e) {

        appointments.add(e);

    }

    public void saveAppointmentTime(String t)  {

        appointmentTime.add(t);

    }

    public void view(){

        for (int i=0 ; i < Appointment.getAppointments().size() ; i++){
            System.out.println("Appointment " + (i+1));
            System.out.println(Appointment.getAppointments().get(i));
            System.out.println("Time of Appointment : " + Appointment.getAppointmentTime().get(i));
            System.out.println("----------------------------");
        }

        if (Appointment.getAppointments().size() == 0){
            System.out.println("There is no available appointments.");
        }

    }

    public void cancel(int x){

        appointments.remove(x);
        appointmentTime.remove(x);

    }

    public void change(){
    }

}
