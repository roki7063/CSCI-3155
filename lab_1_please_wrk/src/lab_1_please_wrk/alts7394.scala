package lab_1_please_wrk

class alts7394 {
	  def abs(n: Double):Double = 
	  {
	    if (n < 0)
	      return (n * -1)
	    else
	      return n 
	  }
	 abs(-5.5)
 
	 def xor(a:Boolean, b:Boolean):Boolean = 
	 {
	   if (a){
	     if (b){
	       return false
	     }
	     else (return true)
	   }
	   else {
	     if (b){
	       return true
	     }
	     else {
	       return false
	     }
	   }
	 }
	 xor(false,false)

	def repeat(s: String, n: Int): String = 
	{
	   if (n <= 0)
	     return "BAD"
	   else { 
		   if (n == 1 ){
		     return s
		   }
		   
		   else {
		     return s + repeat(s,(n-1))
		   }
	   }
	}
	repeat("s", 10)
	
	/*def sqrtStep(c: Double, xn: Double): Double =
	{
	  return xn - (((xn*xn)-c)/(2*xn))
	}
 
	def sqrtN(c: Double, x0: Double, n: Int): Double = //assuming clean input
	{
	  if (n == 1){
	    return 0
	  }
	  else {
	    return sqrtStep(sqrt())
	  }
	  
	}
	
	}*/
	//objectkeyword name
	
}
