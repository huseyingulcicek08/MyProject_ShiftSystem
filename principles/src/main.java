import java.util.InputMismatchException;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Employee dr1 = new Doctor("Akif", 37, "male", "08:00 / 20:00", "Oculist");
        Employee dr2 = new Doctor("Hüseyin", 32, "male", "08:00 / 20:00", "Paediatrician");
        Employee dr3 = new Doctor("Eda", 43, "female", "08:00 / 20:00", "Internist");
        Employee dr4 = new Doctor("Ahmet", 51, "male", "20:00 / 08:00", "Emergency");

        Employee dri1 = new Driver("Ege", 27, "male", "08:00 / 16:00", "B");
        Employee dri2 = new Driver("Engin", 28, "male", "16:00 / 00:00", "B");
        Employee dri3 = new Driver("Osman", 28, "male", "00:00 / 08:00", "E");

        Employee ls1 = new Locksmith("Mustafa", 42, "male", "08:00 / 20:00");
        Employee ls2 = new Locksmith("Mert", 34, "male", "12:00 / 00:00");
        Employee ls3 = new Locksmith("Berk", 25, "male", "00:00 / 08:00");

        Employee p1 = new Plumber("Can", 30, "male", "08:00 / 16:00");
        Employee p2 = new Plumber("Murat", 27, "male", "16:00 / 00:00");
        Employee p3 = new Plumber("Mehmet", 30, "male", "00:00 / 08:00");

        Appointment appointment = new Appointment();


        System.out.println("Welcome to the Shift System!");

        String operations = "Press 1 to make an appointment. \n" +
                "Press 2 to view available appointments. \n" +
                "Press 3 to cancel an appointment. \n" +
                "Press q to quit.";

        while (true) {

            System.out.println(operations);

            String choice = input.nextLine();

            if (choice.equals("1")) {

                System.out.println("Press 1 for doctors \n" +
                        "Press 2 for drivers \n" +
                        "Press 3 for locksmiths \n" +
                        "Press 4 for plumbers");

                String job = input.nextLine();

                if (job.equals("1")) {
                    System.out.println("Here are the doctors");
                    System.out.println("-------------------------------");
                    System.out.println(dr1.ShowInformations());
                    System.out.println("-------------------------------");
                    System.out.println(dr2.ShowInformations());
                    System.out.println("-------------------------------");
                    System.out.println(dr3.ShowInformations());
                    System.out.println("-------------------------------");
                    System.out.println(dr4.ShowInformations());
                    System.out.println("-------------------------------");
                    System.out.println("Type the name of the doctor you want to choose");
                    String choosenDr = input.nextLine();

                    if (choosenDr.equals("Akif")) {
                        System.out.println("You have chosen Dr. Akif");
                        System.out.println("Enter the time you want the appointment to the system." +
                                "(Between 08:00 - 20:00. Appointments are 30 minutes apart. Example 10:00, 12:30).");
                        System.out.println("These are the doctor's free hours.");
                        System.out.println("08:00 - 11:30 - 14:00 - 19:00");
                        String time;
                        time = input.nextLine();
                        if (time.equals("08:00") || time.equals("11:30") || time.equals("14:00") || time.equals("19:00")) {

                            appointment.saveAppointment(dr1);
                            appointment.saveAppointmentTime(time);

                            System.out.println("The appointment was successfully received.");


                        } else {

                            System.out.println("Enter a valid time.");

                        }


                    } else if (choosenDr.equals("Hüseyin")) {
                        System.out.println("You have chosen Dr. Hüseyin");
                        System.out.println("Enter the time you want the appointment to the system." +
                                "(Between 08:00 - 20:00. Appointments are 30 minutes apart. Example 10:00, 12:30).");
                        System.out.println("These are the doctor's free hours.");
                        System.out.println("09:30 - 11:30 - 15:30 - 18:00");
                        String time;
                        time = input.nextLine();
                        if (time.equals("09:30") || time.equals("11:30") || time.equals("15:30") || time.equals("18:00")) {

                            appointment.saveAppointment(dr2);
                            appointment.saveAppointmentTime(time);

                            System.out.println("The appointment was successfully received.");


                        } else {

                            System.out.println("Enter a valid time.");

                        }

                    } else if (choosenDr.equals("Eda")) {
                        System.out.println("You have chosen Dr. Eda");
                        System.out.println("Enter the time you want the appointment to the system." +
                                "(Between 08:00 - 20:00. Appointments are 30 minutes apart. Example 10:00, 12:30).");
                        System.out.println("These are the doctor's free hours.");
                        System.out.println("10:30 - 11:30 - 12:00 - 17:00");
                        String time;
                        time = input.nextLine();
                        if (time.equals("10:30") || time.equals("11:30") || time.equals("12:00") || time.equals("17:00")) {

                            appointment.saveAppointment(dr3);
                            appointment.saveAppointmentTime(time);

                            System.out.println("The appointment was successfully received.");


                        } else {

                            System.out.println("Enter a valid time.");

                        }

                    } else if (choosenDr.equals("Ahmet")) {
                        System.out.println("You have chosen Dr. Ahmet");
                        System.out.println("Enter the time you want the appointment to the system." +
                                "(Between 20:00 - 08:00. Appointments are 30 minutes apart. Example 05:00, 07:30).");
                        System.out.println("These are the doctor's free hours.");
                        System.out.println("21:00 - 02:30 - 04:30 - 07:00");
                        String time;
                        time = input.nextLine();
                        if (time.equals("21:00") || time.equals("02:30") || time.equals("04:30") || time.equals("07:00")) {

                            appointment.saveAppointment(dr4);
                            appointment.saveAppointmentTime(time);

                            System.out.println("The appointment was successfully received.");


                        } else {

                            System.out.println("Enter a valid time.");

                        }

                    } else {

                        System.out.println("Enter a valid name.");

                    }

                } else if (job.equals("2")) {
                    System.out.println("Here are the drivers");
                    System.out.println("-------------------------------");
                    System.out.println(dri1.ShowInformations());
                    System.out.println("-------------------------------");
                    System.out.println(dri2.ShowInformations());
                    System.out.println("-------------------------------");
                    System.out.println(dri3.ShowInformations());
                    System.out.println("-------------------------------");
                    System.out.println("Type the name of the driver you want to choose");
                    String choosenDri = input.nextLine();

                    if (choosenDri.equals("Ege")) {
                        System.out.println("You have chosen driver Ege");
                        System.out.println("Enter the time you want the appointment to the system." +
                                "(Between 08:00 - 16:00. Appointments are 30 minutes apart. Example 10:00, 12:30).");
                        System.out.println("These are the driver's free hours.");
                        System.out.println("08:00 - 11:30 - 12:00 - 15:00");
                        String time;
                        time = input.nextLine();
                        if (time.equals("08:00") || time.equals("11:30") || time.equals("12:00") || time.equals("15:00")) {

                            appointment.saveAppointment(dri1);
                            appointment.saveAppointmentTime(time);

                            System.out.println("The appointment was successfully received.");


                        } else {

                            System.out.println("Enter a valid time.");

                        }


                    } else if (choosenDri.equals("Engin")) {
                        System.out.println("You have chosen driver Engin");
                        System.out.println("Enter the time you want the appointment to the system." +
                                "(Between 16:00 - 00:00. Appointments are 30 minutes apart. Example 17:00, 18:30).");
                        System.out.println("These are the driver's free hours.");
                        System.out.println("17:00 - 19:30 - 22:00 - 23:00");
                        String time;
                        time = input.nextLine();
                        if (time.equals("17:00") || time.equals("19:30") || time.equals("22:00") || time.equals("23:00")) {

                            appointment.saveAppointment(dri2);
                            appointment.saveAppointmentTime(time);

                            System.out.println("The appointment was successfully received.");


                        } else {

                            System.out.println("Enter a valid time.");

                        }


                    }

                    else if (choosenDri.equals("Osman")) {
                        System.out.println("You have chosen driver Osman");
                        System.out.println("Enter the time you want the appointment to the system." +
                                "(Between 00:00 - 08:00. Appointments are 30 minutes apart. Example 01:00, 02:30).");
                        System.out.println("These are the driver's free hours.");
                        System.out.println("01:00 - 03:30 - 07:00 - 07:30");
                        String time;
                        time = input.nextLine();
                        if (time.equals("01:00") || time.equals("03:30") || time.equals("07:00") || time.equals("07:30")) {

                            appointment.saveAppointment(dri3);
                            appointment.saveAppointmentTime(time);

                            System.out.println("The appointment was successfully received.");


                        } else {

                            System.out.println("Enter a valid time.");

                        }


                    }

                    else {

                        System.out.println("Enter a valid name.");

                    }


                }
                else if (job.equals("3")) {
                    System.out.println("Here are the locksmiths");
                    System.out.println("-------------------------------");
                    System.out.println(ls1.ShowInformations());
                    System.out.println("-------------------------------");
                    System.out.println(ls2.ShowInformations());
                    System.out.println("-------------------------------");
                    System.out.println(ls3.ShowInformations());
                    System.out.println("-------------------------------");
                    System.out.println("Type the name of the locksmith you want to choose");
                    String choosenLs = input.nextLine();

                    if (choosenLs.equals("Mustafa")) {
                        System.out.println("You have chosen locksmith Mustafa");
                        System.out.println("Enter the time you want the appointment to the system." +
                                "(Between 08:00 - 20:00. Appointments are 30 minutes apart. Example 10:00, 12:30).");
                        System.out.println("These are the locksmith's free hours.");
                        System.out.println("08:00 - 11:30 - 15:00 - 19:30");
                        String time;
                        time = input.nextLine();
                        if (time.equals("08:00") || time.equals("11:30") || time.equals("15:00") || time.equals("19:30")) {

                            appointment.saveAppointment(ls1);
                            appointment.saveAppointmentTime(time);

                            System.out.println("The appointment was successfully received.");


                        } else {

                            System.out.println("Enter a valid time.");

                        }
                    }

                    else if (choosenLs.equals("Mert")) {
                        System.out.println("You have chosen locksmith Mert");
                        System.out.println("Enter the time you want the appointment to the system." +
                                "(Between 12:00 - 00:00. Appointments are 30 minutes apart. Example 12:00, 12:30).");
                        System.out.println("These are the locksmith's free hours.");
                        System.out.println("12:30 - 14:30 - 21:00 - 23:30");
                        String time;
                        time = input.nextLine();
                        if (time.equals("12:30") || time.equals("14:30") || time.equals("21:00") || time.equals("23:30")) {

                            appointment.saveAppointment(ls2);
                            appointment.saveAppointmentTime(time);

                            System.out.println("The appointment was successfully received.");


                        } else {

                            System.out.println("Enter a valid time.");

                        }
                    }

                    else if (choosenLs.equals("Berk")) {
                        System.out.println("You have chosen locksmith Berk");
                        System.out.println("Enter the time you want the appointment to the system." +
                                "(Between 00:00 - 08:00. Appointments are 30 minutes apart. Example 00:00, 02:30).");
                        System.out.println("These are the locksmith's free hours.");
                        System.out.println("01:00 - 03:30 - 05:00 - 07:30");
                        String time;
                        time = input.nextLine();
                        if (time.equals("01:00") || time.equals("03:30") || time.equals("05:00") || time.equals("07:30")) {

                            appointment.saveAppointment(ls3);
                            appointment.saveAppointmentTime(time);

                            System.out.println("The appointment was successfully received.");


                        } else {

                            System.out.println("Enter a valid time.");

                        }
                    }

                    else {

                        System.out.println("Enter a valid name.");

                    }

                }

                else if (job.equals("4")) {
                    System.out.println("Here are the plumbers");
                    System.out.println("-------------------------------");
                    System.out.println(p1.ShowInformations());
                    System.out.println("-------------------------------");
                    System.out.println(p2.ShowInformations());
                    System.out.println("-------------------------------");
                    System.out.println(p3.ShowInformations());
                    System.out.println("-------------------------------");
                    System.out.println("Type the name of the plumber you want to choose");
                    String choosenP = input.nextLine();

                    if (choosenP.equals("Can")) {
                        System.out.println("You have chosen plumber Can");
                        System.out.println("Enter the time you want the appointment to the system." +
                                "(Between 08:00 - 16:00. Appointments are 30 minutes apart. Example 10:00, 12:30).");
                        System.out.println("These are the plumber's free hours.");
                        System.out.println("08:00 - 11:30 - 15:00 - 15:30");
                        String time;
                        time = input.nextLine();
                        if (time.equals("08:00") || time.equals("11:30") || time.equals("15:00") || time.equals("15:30")) {

                            appointment.saveAppointment(p1);
                            appointment.saveAppointmentTime(time);

                            System.out.println("The appointment was successfully received.");


                        } else {

                            System.out.println("Enter a valid time.");

                        }
                    }

                    else if (choosenP.equals("Murat")) {
                        System.out.println("You have chosen plumber Murat");
                        System.out.println("Enter the time you want the appointment to the system." +
                                "(Between 16:00 - 00:00. Appointments are 30 minutes apart. Example 16:00, 17:30).");
                        System.out.println("These are the plumber's free hours.");
                        System.out.println("16:00 - 17:30 - 21:00 - 23:30");
                        String time;
                        time = input.nextLine();
                        if (time.equals("16:00") || time.equals("17:30") || time.equals("21:00") || time.equals("23:30")) {

                            appointment.saveAppointment(p2);
                            appointment.saveAppointmentTime(time);

                            System.out.println("The appointment was successfully received.");


                        } else {

                            System.out.println("Enter a valid time.");

                        }
                    }

                    else if (choosenP.equals("Mehmet")) {
                        System.out.println("You have chosen plumber Mehmet");
                        System.out.println("Enter the time you want the appointment to the system." +
                                "(Between 00:00 - 08:00. Appointments are 30 minutes apart. Example 02:00, 02:30).");
                        System.out.println("These are the plumber's free hours.");
                        System.out.println("01:00 - 03:30 - 04:30 - 07:30");
                        String time;
                        time = input.nextLine();
                        if (time.equals("01:00") || time.equals("03:30") || time.equals("04:30") || time.equals("07:30")) {

                            appointment.saveAppointment(p3);
                            appointment.saveAppointmentTime(time);

                            System.out.println("The appointment was successfully received.");


                        } else {

                            System.out.println("Enter a valid time.");

                        }
                    }

                    else {

                        System.out.println("Enter a valid name.");

                    }

                }
            }

            else if (choice.equals("2")) {

                System.out.println("Your Appointments");

                System.out.println("----------------------------");

                appointment.view();

            }

            else if (choice.equals("3")) {

                try {
                    System.out.println("Enter the appointment number you want to cancel.");
                    appointment.view();
                    int appointmentNo;
                    appointmentNo = input.nextInt();
                    input.nextLine();
                    appointment.cancel(appointmentNo - 1);
                    System.out.println("Appointment has canceled succesfully");
                }
                catch (IndexOutOfBoundsException e){
                    System.out.println("Enter a valid appointment number");
                }
                catch (InputMismatchException e){
                    System.out.println("Enter a valid appointment number");
                }
            }

            else if (choice.equals("q")) {

                System.out.println("Exiting the system...");
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    System.out.println("Something went wrong.");
                }
                break;
            }
            else {
                System.out.println("Enter a valid operation.");
            }

        }
    }
}