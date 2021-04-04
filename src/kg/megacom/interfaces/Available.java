package kg.megacom.interfaces;

import kg.megacom.classes.Information;
@FunctionalInterface
public interface Available{
    boolean availability(Information information);
}