
public class Driver {
	
  	
  	public static void main(String [] args) {
      
      	Polynomial p = new Polynomial();
		System.out.println(p.evaluate(3));

		double [] c1 = {-12,3};
      	int [] e1 = {0,2};
		Polynomial p1 = new Polynomial(c1, e1);
      
		double [] c2 = {-22,5,2};
      	int [] e2 = {0,1,4};
		Polynomial p2 = new Polynomial(c2,e2);
      
		Polynomial s = p1.add(p2);
		System.out.println("s(0.1) = " + s.evaluate(0.1));
      	
      
      	double x = 1.7023;
      
      	System.out.println(s.evaluate(x));
      
		if(s.hasRoot(x))
			System.out.println("Root!");
		else
			System.out.println("Not a root");
    }
      
}