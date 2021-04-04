package kg.megacom.classes;

import kg.megacom.enums.Hotels;
import kg.megacom.enums.Rooms;
import kg.megacom.enums.Stars;

public class Information extends BookingRoom{
    private String name;
    private int cost;
    private Hotels hotel;
    private Rooms room;
    private Stars stars;

    public Information(String name, int cost, Hotels hotel, Rooms room, Stars stars) {
        this.name = name;
        this.cost = cost;
        this.hotel = hotel;
        this.room = room;
        this.stars = stars;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public Hotels getHotel() {
        return hotel;
    }

    public void setHotel(Hotels hotel) {
        this.hotel = hotel;
    }

    public Rooms getRoom() {
        return room;
    }

    public void setRoom(Rooms room) {
        this.room = room;
    }

    public Stars getStars() {
        return stars;
    }

    public void setStars(Stars stars) {
        this.stars = stars;
    }

    @Override
    public String toString() {
        return "Information{" +
                "name='" + name + '\'' +
                ", cost=" + cost +
                ", hotel=" + hotel +
                ", room=" + room +
                ", stars=" + stars +
                '}';
    }
}
