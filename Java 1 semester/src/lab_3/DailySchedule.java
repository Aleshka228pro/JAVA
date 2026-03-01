package lab_3;

import java.util.ArrayList;

public class DailySchedule
{
    private ArrayList apptList;

    public DailySchedule() {
        apptList = new ArrayList();
    }
    
    // removes all appointments that overlap the given Appointment
    // postcondition: all appointments that have a time conflict with
    //    appt have been removed from this DailySchedule
    public void clearConflicts(Appointment appt) {
        for (int i = apptList.size() - 1; i >= 0; i--) {
            Appointment appt2 = (Appointment) apptList.get(i);
            if (appt2.conflictsWith(appt)) {
                apptList.remove(i);
            }
        }
    }

    // if emergency is true, clears any overlapping appointments and adds
    // postcondition: all appointments are cleared; if there are no conflicts,
    //    appointments are added to the schedule
    // returns true if the appointment was added;
    // otherwise, returns false
    // один конфликт - не добавляем
    public boolean addAppt(Appointment appt, boolean emergency) { 
        if (emergency) {
            clearConflicts(appt);
            apptList.add(appt);
            return true;
        }
        else {
            for (int i = 0; i < apptList.size(); i++) {
                Appointment appt2 = (Appointment) apptList.get(i); 
                if (appt2.conflictsWith(appt)) {
                    return false;
                }
            }
            apptList.add(appt);
            return true;
        }
    }

    public void printSchedule() {
        for (int i = 0; i < apptList.size(); i++)
        {
            Appointment appt = (Appointment) apptList.get(i);
            
            TimeInterval time = appt.getTime();
            
            int startHour = time.getStart();
            int endHour = time.getEnd();
            
            System.out.println((i + 1) + ". " + startHour + ":00-" + endHour + ":00");
        }
        System.out.println();
    }
}