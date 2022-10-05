public class Polynomial {
  
	double coef[] = new double[10]; //only non-zero coefficients
  	int expo[] = new int[10]; //corresponding 
		
	Polynomial(){
		for (int i = 0; i < 10; i++){
			coef[i] = 0.0;
          	expo[i] = 0;
		}
	}

	Polynomial(double[] newcoef, int[] newexpo){
		for (int i = 0; i < newcoef.length; i++){
			coef[i] = newcoef[i];
          	expo[i] = newexpo[i];
		}
	}

  
	Polynomial add(Polynomial newpoly) {
      	double[] finalcoef = new double[10];
      	int[] finalexpo = new int[10];
      
 
		for (int i = 0; i < 10; i++){
			finalcoef[i] = coef[i] + newpoly.coef[i];
          	finalexpo[i] = expo[i] + newpoly.expo[i];
		}
		return new Polynomial(finalcoef, finalexpo);
	}
  	
  	boolean contains(int x, int[] array){
      for(int i = 0; i < 10; i++){
        if(array[i] == x)
          return true;
      }
      return false;
    }


	double evaluate(double X){
		double y = 0;
		for (int i = 0; i < 10; i++){
			y += coef[i] * Math.pow(X, expo[i]);
		}
		return y;
	}

	boolean hasRoot(double X){
		double y = 0;
		for (int i = 0; i < 10; i++){
			y += coef[i] * Math.pow(X, expo[i]);
		}
		return (y == 0);
	}
}
