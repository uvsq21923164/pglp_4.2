package Uvsq21923164.exo4_2;

/**
  * Interface ajoutée puisqu'on a pas besoin d'annuler Undo et Exit
 * Permet de respecter ISP (segregation des interfaces)
 */
public interface UndoableCommand extends Command {

	public void undo();
	
}
