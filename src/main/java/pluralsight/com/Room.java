package pluralsight.com;

public class Room {
    private int numberOfBeds;
    private double price;
    private boolean isOccupied, isDirty;

    public Room(int numberOfBeds, double price) {
        this.numberOfBeds = numberOfBeds;
        this.price = price;
        this.isOccupied = false;
        this.isDirty = false;
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public double getPrice() {
        return this.price;
    }

    public boolean isOccupied() {
        return this.isOccupied;
    }

    public boolean isDirty() {
        return this.isDirty;
    }

    public boolean isAvailable() {
        return (!this.isOccupied && !this.isDirty);
    }

    public void checkIn() {
        this.isOccupied = true;
        this.isDirty = true;
    }

    public void checkOut() {
        this.isOccupied = false;
    }

    public void cleanRoom() {
        this.isDirty = false;
    }

    }

