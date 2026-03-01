package lab_3;

public class TimeInterval {

    private int startHour;
    private int endHour;

    public int getStart() {
        return startHour;
    }

    public int getEnd() {
        return endHour;
    }
    
    public TimeInterval(int startHour, int endHour) {
        this.startHour = startHour;
        this.endHour = endHour;
    }

    // returns true if interval overlaps with this TimeInterval;
    // otherwise, returns false
    public boolean overlapsWith(TimeInterval interval) {
        // два интервала пересекаются если каждый из них начинается до окончания другого
        return (startHour < interval.endHour && interval.startHour < endHour);
    }
}