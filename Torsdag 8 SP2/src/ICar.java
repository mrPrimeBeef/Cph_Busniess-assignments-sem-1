import java.util.ArrayList;

public interface ICar {
    public String getRegistrationNumber();
    public String getMake();
    public String getModel();
    public int getNumberOfDoors();
    public int getRegistrationFee();
    public String toCSV();
}


//1.    Interface Car. Skal have følgende metoder:
//a.    String getRegistrationNumber(); //The number on the number plate
//b.    String getMake(); // The make of the car e.g. Audi
//c.    String getModel(); // The model of the car e.g. A6
//d.    Int getNumberOfDoors(); // The number of doors
//e.    Int getRegistrationFee(); // Calculates the registration fee for the car