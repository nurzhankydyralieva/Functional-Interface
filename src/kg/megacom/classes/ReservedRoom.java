package kg.megacom.classes;

import kg.megacom.interfaces.Reservationable;

public class ReservedRoom implements Reservationable {
    public void reservedRoom(){
        System.out.println("If false - room reserved");
    }

    @Override
    public void roomReserved() {
        reservedRoom();
    }


}
