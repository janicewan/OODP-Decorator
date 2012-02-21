package tests;

import static org.junit.Assert.assertEquals;
import oldCode.LivingRoom;
import oldCode.Room;

import org.junit.Test;

public class LivingRoomTest {

	@Test
	public void test() {
		String expectedResult= "LivingRoom";
		String actualResult= null;
		Room classUnderTest= new LivingRoom();
		actualResult= classUnderTest.whatKindOfRoomAreYou();
		assertEquals("Wrong answer! ", expectedResult, actualResult);
	}

}
