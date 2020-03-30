package Uvsq21923164.exo4_2;

import java.util.Stack;

public class OperationCommand implements UndoableCommand {

	
	
	private double dernier;
	private double avantDernier;
	private Operation operation;
	private Stack<Double> pile;
	
	public OperationCommand(Stack<Double> pile, Operation operation) {
		ExceptionHandler.handleStackSize(pile.size(), 2);
		this.pile = pile;
		this.operation = operation;
	}


	public void apply() {
		double result;
		this.dernier = this.pile.pop();
		this.avantDernier = this.pile.pop();
		try {
			result = operation.eval(avantDernier, dernier);
			ExceptionHandler.handleMinMax(result);
			this.pile.push(result);
		}
		catch (ArithmeticException e) {
			this.pile.push(avantDernier);
			this.pile.push(dernier);
			throw e;
		}
	}
	
	
	public void undo() {
		this.pile.pop();
		this.pile.push(avantDernier);
		this.pile.push(dernier);
	}

}
