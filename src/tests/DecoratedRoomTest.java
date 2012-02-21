/**
 * 
 */
package tests;

import static org.junit.Assert.*;

import newCode.DecoratedRoom;

import oldCode.BedRoom;

import org.junit.Test;

/**
 * @author jwan01
 *
 */
public class DecoratedRoomTest {

	@Test
	public void test() {
		String expectedResult= "BedRoom";
		String actualResult= null;
		DecoratedRoom classUnderTest= new DecoratedRoom(new BedRoom());
		actualResult= classUnderTest.whatKindOfRoomAreYou();
		assertEquals("Wrong answer! ", expectedResult, actualResult);
	}

}
