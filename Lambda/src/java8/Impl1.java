package java8;

public class Impl1 implements Interface1
{
	
	public void printMessage()
	{
		String s = "Neha";
		boolean i =  validate11(s);
		System.out.println(i);
	}
	
	@Override
	public boolean validate11(String str) {
		if(str != null || !str.equals(""))
	       {
	              return true;
	       }
	       else
	       {
	             return false;
	       }
		
	}

//	@Override
//	public void printMessage() {
//		System.out.println("Inside Impl1");
//		
//	}
	
	

}
