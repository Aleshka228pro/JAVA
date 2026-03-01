package lab_3;

public class main_lab_3 {
    public static void main(String[] args) {
        DailySchedule schedule = new DailySchedule();

        Appointment meet1 = new Appointment(new TimeInterval(9, 10));
        Appointment meet2 = new Appointment(new TimeInterval(11, 12));
        Appointment meet3 = new Appointment(new TimeInterval(9, 11));  


        schedule.addAppt(meet1, false);
        schedule.printSchedule();

        schedule.addAppt(meet2, false);
        schedule.printSchedule();

        schedule.addAppt(meet3, false);
        schedule.printSchedule();

        schedule.addAppt(meet3, true);
        schedule.printSchedule();


    }
}
