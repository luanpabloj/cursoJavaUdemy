package entities;


public class retangulo {

		public double x;
		public double y;
		
		public double area() {
			
			double a = x*y;
			return a;
			
		}
		
		public double perimetro() {
			
			double p = 2*x + 2*y;
			return p;
			
		}
		
		public double diagonal() {
			
			double d = Math.sqrt((Math.pow(x, 2) + Math.pow(y, 2)));
			return d;
		}
	
	
	
}
