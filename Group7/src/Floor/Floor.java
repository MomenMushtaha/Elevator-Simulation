package Floor;

import Utilities.*;
import Events.*;

/**
 * Class to simulate a floor of a building.
 * @author lynnmehyou, Marc Angers
 * @version 1.1
 */
public class Floor {
	public static final int MINIMUM_FLOOR_NUM = 1;
	
	private int floorNumber;
	private FloorButton upButton;
	private FloorButton downButton;
	
	private boolean isElevatorApproaching;
	private boolean isElevatorAtFloor;
	private FormattedEvent fe;
	
	public Floor(int floorNumber) {
		this.floorNumber= floorNumber;
		
		if (floorNumber < Settings.NUMBER_OF_FLOORS)
			this.upButton = new FloorButton(Direction.UP);
		if (floorNumber > 1)
			this.downButton = new FloorButton(Direction.DOWN);
	}
	
	/**
	 * Returns the floor number.
	 * @return
	 */
	public int getFloorNumber() {
		return floorNumber;
	}
	
	/**
	 * Turn on the lamp for the button corresponding to the given direction.
	 * @param direction
	 */
	public void turnOnLamp(Direction direction) {
		if (direction == Direction.UP) 
			upButton.press();
		if (direction == Direction.DOWN)
			downButton.press();
	}
	
	/**
	 * Turn off the lamp for the button corresponding to the given direction.
	 * @param direction
	 */
	public void turnOffLamp(Direction direction) {
		if (direction == Direction.UP) 
			upButton.unPress();
		if (direction == Direction.DOWN)
			downButton.unPress();
	}

	/***
	 * returns true if the elevator is approaching the current floor.
	 * @return
	 */
	public boolean elevatorApproachingFloor() {
		if (fe.getFloor() == fe.getCarButton()+1 || fe.getFloor() == fe.getCarButton()-1) {
			isElevatorApproaching = true;
		}
		else {
			isElevatorApproaching = false;
		}
		return isElevatorApproaching;
	}
	
	/***
	 * returns true if the elevator is at the current floor.
	 * @return
	 */
	
	public boolean elevatorAtFloor() {
		if(fe.getFloor() == fe.getCarButton()) {
			isElevatorAtFloor = true;
		}
		else {
			isElevatorAtFloor = false;
		}
		return isElevatorAtFloor;
	}
	
	// get methods
	public FloorButton getUpButton() {
		return upButton;
	}
	
	public FloorButton getDownButton() {
		return downButton;
	}
}