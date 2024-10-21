package CodingStrings;

public class InsertAStringBetweenAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String originalString = "GeeksGeeks"; 
	    String stringToBeInserted = "For"; 
	    int index = 4;
	    
	    
	    StringBuilder sb = new StringBuilder();
	    sb.append(originalString);
	    
	    sb.insert(index+1, stringToBeInserted);
	    
	    System.out.println(sb);

	}

}
