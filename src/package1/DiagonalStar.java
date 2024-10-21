package package1;

public class DiagonalStar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printSquareStar(8);

	}
	public static void printSquareStar(int number)
    {
		String STAR = "*";
		String SPACE = " ";
        if(number < 5)
        {
            System.out.println("Invalid Value");
        }
        else
        {
        	for(int row=1;row<=number;row++)
        	{      		
	        	for(int col=1;col<=number;col++)
	        	{
	        		boolean firstRowOrColumn = row==1 || col==1;
	        		boolean lastRowOrColumn =  row==number || col==number;
	        		boolean diagonal = row==col || (col == (number - row + 1));
	        		
	        		if(firstRowOrColumn || lastRowOrColumn || diagonal)
	        		{
	        			System.out.print(STAR);
	        		}
	        		else
	        		{
	        			System.out.print(SPACE);
	        		}  		
	        	}
	        	System.out.println();
        	}
        	

        }
        
    }

}
