package package1;

import java.util.ArrayList;
import java.util.List;

public class Java8Features {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 List<String> list=new ArrayList<String>();  
	        list.add("ankit");  
	        list.add("mayank");  
	        list.add("irfan");  
	        list.add("jai"); 
	        
	        list.forEach(

	        		(p)-> System.out.println("Person's name is "+p));
	}

}
