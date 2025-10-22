package pluralsight.com;

public class Hotel {
    private String name;
    private int numberOfSuites;
    private int numberOfRooms;
    private int bookedSuites;
    private int bookedBasicRooms;

    public Hotel(String name, int numberOfSuites, int numberOfRooms) {
        this.name = name;
        this.numberOfSuites = numberOfSuites;
        this.numberOfRooms = numberOfRooms;

    }
    public Hotel(String name, int numberOfSuites, int numberOfRooms, int bookedSuites, int bookedBasicRooms) {
        this.name = name;
        this.numberOfSuites = numberOfSuites;
        this.numberOfRooms = numberOfRooms;
        this.bookedSuites = bookedSuites;
        this.bookedBasicRooms = bookedBasicRooms;
    }
} public boolean bookRoom(int numberOfRooms, boolean isSuite){
    if (isSuite = true){

    }
}

    public int getAvailableSuites() {
        int availableSuites = int numberOfSuites - int bookedSuites;
        return availableSuites;

    }
    public int getAvailableRooms() {
    int availableRooms = int numberOfRooms - int bookedBasicRooms;
    return availableRooms;

}
}