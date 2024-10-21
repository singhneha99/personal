package package1;

public class DecimalComparator {
	static boolean var;
	static double rem1;
	static double rem2;
	
	static double div1;
	static double div2;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 var=areEqualByThreeDecimalPlaces(3.1722,3.175);
		System.out.println(var);
		 var=areEqualByThreeDecimalPlaces(3.1756,3.175);
		System.out.println(var);

		 var=areEqualByThreeDecimalPlaces(4.17,3.170);
		System.out.println(var);


	}

	 public static boolean areEqualByThreeDecimalPlaces(double a, double b)
	 {
		 div1=Math.round(a* 10000)/ 10000;
		 div2=Math.round(b* 10)/ 10;
		 
		 if(div1==div2) 
		 {
		     rem1 = Math.floor(a* 1000)% 1000;
		     rem2 = Math.floor(b* 1000)% 1000;
		    
		     if(rem1==rem2)
		     {
		    	 return true;
		     
		     }
		     return false;
		 }
		 return false;
	 }
}


