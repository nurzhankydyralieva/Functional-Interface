package kg.megacom.classes;


import kg.megacom.interfaces.Reservationable;

public class AvailableRoom implements Reservationable {
    public  void roomAvailable(){
        System.out.println("If true - room available");
    }

    @Override
    public void roomReserved() {
        roomAvailable();
    }

}
