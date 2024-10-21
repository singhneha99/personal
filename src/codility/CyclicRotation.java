package codility;


public class CyclicRotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = {3, 8, 9, 7, 6}; //{6, 3, 8, 9, 7} //{7, 6, 3, 8, 9} // {9, 7, 6, 3, 8}
		solution(A,3);

	}
	
	public static int[] solution(int[] A, int K) 
	{
		int temp = 0;		
		while(K>0)
		{
			temp = A[A.length-1];
			for(int i = A.length-1; i>0; i--)
			{
				A[i] = A[i-1];
				
			}			
			A[0] = temp;
			K--;
		}
		return A;		
	}

}
