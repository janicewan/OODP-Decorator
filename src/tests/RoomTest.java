package tests;

import static org.junit.Assert.*;

import oldCode.BedRoom;
import oldCode.Room;

import org.junit.Test;

public class RoomTest {

	@Test
	public void test() {
		String expectedResult= "BedRoom";
		String actualResult= null;
		Room classUnderTest= new BedRoom();
		actualResult= classUnderTest.whatKindOfRoomAreYou();
		assertEquals("Wrong answer! ", expectedResult, actualResult);
	}

}
