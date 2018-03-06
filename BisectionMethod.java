  // Bisection Method - Solves: x^2-x-1=0
    
   public class BisectionMethod
   {
      public static void main(String[] args)
      {
   	 final double epsilon = 0.00001;
   	 double a, b, m, fm, fa;
       int i=1;
    
   	 a = 1;  b = 2;
    
   	 while ( (b-a) > epsilon )
   	 {
   	    m = (a+b)/2;           // Mid point
    
   	    fm = m*m-m-1;       // fm = f(m)
   	    fa = a*a-a-1;       // fa = f(a)
    
   	    if ( (fm > 0 && fa < 0) || (fm < 0 && fa > 0) )
   	    {  
   	       b = m; // f(a) and f(m) have different signs: move b
   	    }
   	    else
   	    {  
   	       a = m; // f(a) and f(m) have same signs: move a
   	    }
            System.out.println("New interval "+i+" :[" + a + " .. " + b + "]");   // Print progress  
            i++;
   	 }
    
   	 System.out.println("Approximate solution = " + (a+b)/2 );
      }
   }