package lab_2;

public class main_lab_2
{
    public static void main(String[] args) {
        Hotel hotel = new Hotel(3); // Отель с 3 комнатами (0, 1, 2)
        
        hotel.requestRoom("Oleg");
        hotel.requestRoom("Bob");
        hotel.printRooms();  


        Reservation r1 = hotel.requestRoom("Gleb");
        hotel.printRooms();  


        hotel.cancelAndReassign(r1);

        hotel.printRooms();

        Reservation r2 = hotel.requestRoom("Igor");
        hotel.requestRoom("Ivan");
        hotel.printWaitList();
        
        hotel.printRooms();
        hotel.printWaitList();
        
        hotel.cancelAndReassign(r2);
        hotel.printRooms();
        hotel.printWaitList();       
    }
}