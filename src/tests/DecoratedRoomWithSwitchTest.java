/**
 * 
 */
package tests;

import static org.junit.Assert.*;

import newCode.DecoratedRoomWithSwitch;

import oldCode.BedRoom;

import org.junit.Test;

/**
 * @author jwan01
 *
 */
public class DecoratedRoomWithSwitchTest {

	@Test
	public void test() {
		String expectedResult= "yes";
		String actualResult= null;
		DecoratedRoomWithSwitch classUnderTest= new DecoratedRoomWithSwitch(new BedRoom());
		actualResult= classUnderTest.isLightOn();
		assertEquals("Wrong answer! ", expectedResult, actualResult);
	}

}
