package pluralsight.com;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RoomTest {
    @org.junit.jupiter.api.Test
    void checkin_should_make_room_dirty_and_occupied() {
        //arrange
        Room roomTest = new Room(0, 0);

        //act
        roomTest.checkIn();

        //assert
        assertTrue(roomTest.isDirty());
        assertTrue(roomTest.isOccupied());
    }

    @Test
    void checkout_should_make_room_is_not_occupied() {
        //arrange
        Room roomTest = new Room(0,0);
        //act
        roomTest.checkOut();
        //assert
        assertFalse(roomTest.isOccupied());
    }

    @Test
    void cleanroom_should_make_room_cleaned() {
        //arrange
        Room roomTest = new Room(0,0);
        //act
        roomTest.cleanRoom();
        //assert
        assertFalse(roomTest.isDirty());
    }
}