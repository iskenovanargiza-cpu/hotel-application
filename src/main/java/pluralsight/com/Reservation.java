package pluralsight.com;

public class Reservation {
    private String roomType;
    private double price;
    private int numberOfNights;
    private boolean isWeekend;

    public Reservation(String roomType,int numberOfNights, boolean isWeekend) {
        this.roomType = roomType.trim(); //Either "King" or "Double"

        if (roomType.equalsIgnoreCase("king")) {
            this.price = 139.00;
        } else {
            this.price = 124.00;
        }
        this.numberOfNights = numberOfNights;
        this.isWeekend = isWeekend;
    }

    public String getRoomType() {
        return roomType;
    }

    public double getPrice() {
        return price;
    }

    public int getNumberOfNights() {
        return numberOfNights;
    }

    public boolean isWeekend() {
        return isWeekend;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;

        if (roomType.equalsIgnoreCase("king")) {
            this.price = 139.00;
        } else  {
            this.price = 124.00;
        }
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setNumberOfNights(int numberOfNights) {
        this.numberOfNights = numberOfNights;
    }

    public void setWeekend(boolean weekend) {
        this.isWeekend = weekend;
    }

    public double getReservationTotal() {
        double upCharge = this.price; //upCharge stays the same when it's not a weekend reservation

        if (this.isWeekend) {
            upCharge *= 1.1;
        }

        return this.numberOfNights * upCharge;
    }
}
