package Uvsq21923164.exo4_2;

public enum Operation {
	PLUS("+"){

		
		public double eval(double x, double y) {
			return x + y;
		}

	}, 

	MOINS("-"){

		@Override
		public double eval(double x, double y) {
			return x - y;
		}

	},

	MULT("*"){

		
		public double eval(double x, double y) {
			return x * y;
		}

	},

	DIV("/"){

		
		public double eval(double x, double y) {
			if(y == 0) {
				throw new DivisionParZeroException();
			}
			return x / y;
		}

	};

	private String symbole;

	
	private Operation(String symbole) {
		this.symbole = symbole; 
	}

	
	public abstract double eval(double x , double y);

	
	public String getSymbole() {
		return symbole;
	}


}
