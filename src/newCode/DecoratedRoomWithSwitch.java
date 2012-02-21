/**
 * 
 */
package newCode;

import oldCode.Room;

/**
 * @author jwan01
 *
 */
public class DecoratedRoomWithSwitch extends DecoratedRoom {
	private String isLO;

	public DecoratedRoomWithSwitch(Room component) {
		super(component);
		isLO= "yes";
	}

	public String isLightOn() {
		return isLO;
	}

}
