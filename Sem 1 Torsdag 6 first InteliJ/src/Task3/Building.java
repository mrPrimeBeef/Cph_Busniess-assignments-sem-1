package Task3;

import java.util.ArrayList;

public class Building {
    private ArrayList<Room> rooms = new ArrayList<>();
    private int numberOfBathrooms;
    private int numberOfFloors;
    private boolean isOfficeBuilding;

    public Building(ArrayList<Room>  rooms, int numberOfBathrooms, int numberOfFloors, boolean isOfficeBuilding){
        this.rooms = rooms;
        this.numberOfBathrooms = numberOfBathrooms;
        this.numberOfFloors = numberOfFloors;
        this.isOfficeBuilding = isOfficeBuilding;
    }

    public int getNumberOfBathrooms() {
        return this.numberOfBathrooms;
    }

    public int getNumberOfFloors() {
        return this.numberOfFloors;
    }

    public ArrayList<Room>  getRooms() {
        return this.rooms;
    }
    public boolean getIsOfficeBuilding(){
        return this.isOfficeBuilding;
    }
}
