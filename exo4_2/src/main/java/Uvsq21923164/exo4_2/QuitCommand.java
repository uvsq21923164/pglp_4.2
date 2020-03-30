package Uvsq21923164.exo4_2;

public class QuitCommand implements Command {
	
	/** # RECEIVER: Switch **/
	
	private Switch interrupteur;
	
	public QuitCommand(Switch interrupteur) {
		this.interrupteur = interrupteur;
	}

	@Override
	public void apply() {
		interrupteur.turnOff();
	}
}
