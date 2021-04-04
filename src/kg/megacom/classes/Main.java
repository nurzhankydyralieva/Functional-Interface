package kg.megacom.classes;

import kg.megacom.enums.Hotels;
import kg.megacom.enums.Rooms;
import kg.megacom.enums.Stars;
import kg.megacom.interfaces.Available;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Information> informationList = new ArrayList<>();
        BookingRoom bookingRoom = new BookingRoom();
        AvailableRoom availableRoom = new AvailableRoom();
        ReservedRoom reservedRoom = new ReservedRoom();
        informationList.add(new Information("Jumeirah Village", 8000, Hotels.RESORT, Rooms.DELUXE_ROOM, Stars.FOUR_STAR));
        informationList.add(new Information("Atana Hotel", 6000, Hotels.AIRPORT_HOTEL, Rooms.CABANA_ROOM, Stars.FIVE_STAR));
        informationList.add(new Information("The Meydan Hotel", 7000, Hotels.FLOATING_HOTEL, Rooms.DOUBLE_ROOM, Stars.TREE_STAR));
        informationList.add(new Information("Grand Hyatt", 3000, Hotels.BOATEL, Rooms.LANAI_ROOM, Stars.FOUR_STAR));
        informationList.add(new Information("Ak keme", 4500, Hotels.SELF_CATERING_HOTEL, Rooms.DUPLEX_ROOM, Stars.ONE_STAR));
        informationList.add(new Information("Sofitel Dubai The Obelisk", 5000, Hotels.SUBURB_HOTEL, Rooms.SINGLE_ROOM, Stars.ONE_STAR));
        informationList.add(new Information("Palm Jumeirah", 2300, Hotels.MOTEL, Rooms.TWIN_ROOM, Stars.TWO_STAR));
        informationList.add(new Information("Sheraton Grand Hotel", 5000, Hotels.ROTEL, Rooms.PRESIDENTIAL_SUITE, Stars.FIVE_STAR));
        informationList.forEach(information -> System.out.println(information));
        System.out.println("\n_______________Cost of rooms are more than 3000");
        Available price = information -> information.getCost() > 3000;
        informationList.forEach(information -> System.out.print(price.availability(information) + " "));
        System.out.println("\n\n_____________________________Available hotels");
        Available hotel = information -> {
            switch (information.getHotel()) {
                case MOTEL:
                case ROTEL:
                case RESORT:
                case SUBURB_HOTEL:
                    return false;
                case BOATEL:
                case FLOATING_HOTEL:
                case SELF_CATERING_HOTEL:
                case AIRPORT_HOTEL:
                    return true;
            }
            return false;
        };
        informationList.forEach(information -> System.out.print(hotel.availability(information) + " "));
        System.out.println("\n\n_____________________________Available rooms");
        Available room = information -> {
            switch (information.getRoom()) {
                case TWIN_ROOM:
                case DELUXE_ROOM:
                case DOUBLE_ROOM:
                case PRESIDENTIAL_SUITE:
                    return true;
                case LANAI_ROOM:
                case DUPLEX_ROOM:
                case CABANA_ROOM:
                case SINGLE_ROOM:
                    return false;
            }
            return false;
        };
        informationList.forEach(information -> System.out.print(room.availability(information) + " "));
        System.out.println("\n\n___________Hotel's stars 'five, four, three = true' and 'one,two = false'");
        Available star = information -> {
            switch (information.getStars()) {
                case FIVE_STAR:
                case FOUR_STAR:
                case TREE_STAR:
                    return true;
                case ONE_STAR:
                case TWO_STAR:
                    return false;
            }
            return false;
        };
        informationList.forEach(information -> System.out.print(star.availability(information) + " "));
        System.out.println("\n");
        //informationList.forEach(information -> System.out.println(price.availability(information) && hotel.availability(information) && room.availability(information) && star.availability(information)));
        bookingRoom.addInfo(availableRoom);
        bookingRoom.addInfo(reservedRoom);
        bookingRoom.addInfo(() -> System.out.println("If price is false, you cannot afford the cost of room"));
        bookingRoom.information();
    }

}
