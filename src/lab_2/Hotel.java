package lab_2;

import java.util.ArrayList;

public class Hotel {
    private Reservation[] rooms;

    private ArrayList waitList;

    public void printWaitList() {
        System.out.println(waitList);
    }

    public void printRooms() {
        for (int i = 0; i < rooms.length; i++) {
            if (rooms[i] == null) {
                System.out.println(i + " empty");
            }
            else {
                System.out.println(rooms[i].getRoomNumber() + " " + rooms[i].getRoomName());
            }
        }
        System.out.println("\n");
    }

    public Hotel(int numRooms){
        waitList = new ArrayList();
        rooms = new Reservation[numRooms];
    }

    public Reservation requestRoom(String guestName) {
        for (int i = 0; i < rooms.length; i++)
            if (rooms[i] == null) {
                rooms[i] = new Reservation(guestName, i);
                return rooms[i];
            }
        waitList.add(guestName);
        return null;
    }


    public Reservation cancelAndReassign(Reservation res) { 

        int room_num = res.getRoomNumber();

        rooms[room_num] = null;

        if (waitList.size() != 0) {
            String guest = (String) waitList.get(0);
            waitList.remove(0);
            rooms[room_num] = new Reservation(guest, room_num);
            return rooms[room_num];
        }
        else {
            return null;
        }
    }

}
