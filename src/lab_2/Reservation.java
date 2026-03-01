package lab_2;

public class Reservation {

    private String guest_name;
    private int room_num;


    public Reservation(String guestName, int roomNumber) {
        guest_name = guestName;
        room_num = roomNumber;
    }

    public int getRoomNumber() {
        return room_num;
    }

    public String getRoomName() {
        return guest_name;
    }
}