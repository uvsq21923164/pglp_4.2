package Uvsq21923164.exo4_2;


public class NombreOperationsException extends IllegalArgumentException {

	
	public NombreOperationsException() {
		super("Il n'y a pas assez d'opérations, il reste au moins deux nombres dans la pile");
	}

}
