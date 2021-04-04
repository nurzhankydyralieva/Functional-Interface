package kg.megacom.classes;

import kg.megacom.interfaces.Reservationable;

import java.util.ArrayList;
import java.util.List;

public class BookingRoom {

    List<Reservationable> customers = new ArrayList<>();
    public void addInfo(Reservationable customer){
        customers.add(customer);
    }

    public  void information(){
        System.out.println("If true you can reserve room");
        for(Reservationable r: customers){
        r.roomReserved();
      }
    }
}
