package Uvsq21923164.exo4_2;

import java.util.Stack;

public class UndoCommand implements Command {
	
	
	
	private UndoableCommand lastCommand;
	
	public UndoCommand(Stack<UndoableCommand> historique) {
		ExceptionHandler.handleStackSize(historique.size(), 1);
		this.lastCommand = historique.pop();
	}

	
	public void apply() {
		lastCommand.undo();		
	}
}
