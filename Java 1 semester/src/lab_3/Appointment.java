package lab_3;

public class Appointment
{
    private TimeInterval time;

    // returns the time interval of this Appointment
    public Appointment(TimeInterval time_) {
        time = time_;
    }

    public TimeInterval getTime() {
        return time;
    }

    // returns true if the time interval of this Appointment
    // overlaps with the time interval of other;
    // otherwise, returns false
    public boolean conflictsWith(Appointment other){ 

        TimeInterval thisTime = getTime(); 
        TimeInterval otherTime = other.getTime(); 

        return thisTime.overlapsWith(otherTime);

    }

}