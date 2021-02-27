package Elevator;

import Events.ElevatorButtonPressEvent;

/**
 * Class to consume the elevator button press events generated by the scheduler.
 * @author Marc Angers
 * @version 1.0.0
 */
public class ElevatorButtonPressEventConsumer implements Runnable {
	private ElevatorSubsystem parent;
	
	public ElevatorButtonPressEventConsumer(ElevatorSubsystem elevatorSubsystem) {
		parent = elevatorSubsystem;
	}
	
	public void consume(ElevatorButtonPressEvent elevatorButtonEvent) {
		parent.getElevator().turnOnLamp(elevatorButtonEvent.buttonNumber);
		System.out.println("Floor button: " + elevatorButtonEvent.buttonNumber + " has been pressed - lamp is on");
	}
	
	@Override
	public void run() {
		while (true) {
			consume(parent.getScheduler().getElevatorButtonEvent());
		}
	}
}
