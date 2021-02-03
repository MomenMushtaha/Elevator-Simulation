import java.sql.Time;
/** 
 * FloorEvent class which creates an object that stores the information needed for 
 * each elevator request.
 * 
 * @author Aaron Gabor
 * @version 1.0.1
 */
class FloorEvent {
	private Time time;
	private int currentFloor;
	private boolean direction; //True = Up | False = Down
	private int carButton;
	
	/**
	 * Constructor for the FloorEvent class, it will read all of the parameters
	 * and set the internal variable to equal the same value.
	 * 
	 * @param time an object of Time, currentFloor an integer value for the floor 
	 * where the request was made, direction a boolean value that states if the 
	 * elevator needs to go up or down, carButton is an integer value for the floor 
	 * where the user would like to travel to.
	 */
	public FloorEvent(Time time, int currentFloor, boolean direction, int carButton)
	{
		this.time = time;
		this.currentFloor = currentFloor;
		this.direction = direction;
		this.carButton = carButton;
	}
	
	/**
	 * getTime is a method where the time variable stored in the FloorEvent object
	 * is sent to different class.
	 * 
	 * @return returns a Time object
	 */
	public Time getTime()
	{
		return this.time;
	}
	
	/**
	 * getCurrentFloor is a method where the currentFloor variable stored in the 
	 * FloorEvent object is sent to different class.
	 * 
	 * @return returns a integer value of the currentFloor
	 */
	public int getCurrentFloor()
	{
		return this.currentFloor;
	}
	
	/**
	 * getDirection is a method where the direction variable stored in the 
	 * FloorEvent object is sent to different class.
	 * 
	 * @return returns a boolean value of the direction variable
	 */
	public boolean getDirection()
	{
		return this.direction;
	}
	
	/**
	 * getCarButton is a method where the carButton variable stored in the 
	 * FloorEvent object is sent to different class.
	 * 
	 * @return returns a integer value of where the elevator wants to go
	 */
	public int getCarButton()
	{
		return this.carButton;
	}
}