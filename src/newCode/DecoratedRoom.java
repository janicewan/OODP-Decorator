/**
 * 
 */
package newCode;

import oldCode.Room;

/**
 * @author jwan01
 *
 */
public class DecoratedRoom extends Room {

	Room component;
	/* (non-Javadoc)
	 * @see oldCode.Room#whatKindOfRoomAreYou()
	 */
	@Override
	public String whatKindOfRoomAreYou() {
		// TODO Auto-generated method stub
		return component.whatKindOfRoomAreYou();
	}
	/**
	 * @param component
	 */
	public DecoratedRoom(Room component) {
		super();
		this.component = component;
	}

}
