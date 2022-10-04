class Polynomial {
	//(I) Array of double
	double coef[] = new double[10];
		
	//(II) No-argument constructor that sets the polynomial to zero 
	Polynomial(){
		for (int i = 0; i < 10; i++){
			coef[i] = 0.0;
		}
	}

	//(III) Constructor that takes an array of double as an argument and sets the coefficients accordingly
	Polynomial(double[] newcoef){
		for (int i = 0; i < newcoef.length; i++){
			coef[i] = newcoef[i];
		}
	}

	//(IV) It has a method named add that takes one argument of type Polynomial and returns the polynomial resulting from adding the calling object and the argument
	Polynomial add(Polynomial newpoly) {
      	double[] finalpoly = new double[10];
		for (int i = 0; i < 10; i++){
			finalpoly[i] = coef[i] + newpoly.coef[i];
		}
		return new Polynomial(finalpoly);
	}

	//(V) It has a method named evaluate that takes one argument of type double representing a value of x and evaluates the polynomial accordingly.
	double evaluate(double X){
		double y = 0;
		for (int i = 0; i < 10; i++){
			y += coef[i] * Math.pow(X, i);
		}
		return y;
	}

	//It has a method named hasRoot that takes one argument of type double and determines whether this value is a root of the polynomial or not. N
	boolean hasRoot(double Y){
		double finalY = 0;
		for (int i = 0; i < 10; i++){
			finalY += coef[i] * Math.pow(Y, i);
		}
		return (finalY == 0);
	}
}