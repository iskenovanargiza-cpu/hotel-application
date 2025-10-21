package pluralsight.com;

public class Room {
    private int numberOfBeds;
    private double price;
    private boolean isOccupied, isDirty;

    public Room(int numberOfBeds, double price, boolean isOccupied, boolean isDirty, boolean isAvailable) {
        this.numberOfBeds = numberOfBeds;
        this.price = price;
        this.isOccupied = isOccupied;
        this.isDirty = isDirty;
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public double getPrice() {
        return price;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public boolean isDirty() {
        return isDirty;
    }

    public boolean isAvailable() {
        return (!this.isOccupied && !this.isDirty);
    }

    public void checkIn() {
        boolean b = this.isOccupied && this.isDirty;
    }

    public boolean checkout() {
        return (!this.isDirty && !this.isOccupied);
    }

    public boolean cleanRoom() {
        return (!this.isDirty);

    }
}
