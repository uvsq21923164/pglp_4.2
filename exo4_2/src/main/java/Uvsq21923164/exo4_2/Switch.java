package Uvsq21923164.exo4_2;

public class Switch {
	private boolean switchOn;

	/**
	 * @param switchOn
	 */
	public Switch() {
		this.switchOn = true;
	}
	
	public boolean isOn() {
		return switchOn;
	}
	
	public void turnOff() {
		switchOn = false;
	}	
	
	public void turnOn() {
		switchOn = true;
	}	
}
