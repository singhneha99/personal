package codility;

public class TriangleTriplet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] triplets = 
			//{10,50,5,1};
			{10,2,5,1,8,20};
		solution(triplets);
	}
	
	public static int solution(int[] A)
	{
		int result = 0;
//		for(int i = 0; i<A.length-2; i++)
//		{
//			for(int j = i+1; j<A.length-1; j++)
//			{
//				for(int k = j+1; k < A.length; k++)
//				{
//					if(A[i] + A[j] > A[k]
//						&& A[k] + A[j] > A[i]
//						&& A[i] + A[k] > A[j])
//					{
//						result = 1;
//						break;
//					}
//									
//				}
//			}
//		}
		for(int i = 0; i< A.length-2; i++)
		{
			if(A[i] + A[i+1] > A[i+2]&& A[i+2] + A[i+1] > A[i]
					&& A[i] + A[i+2] > A[i+1])
			{
				result = 1;
				break;
			}
//					
		}
		System.out.print(result);
		return result;
		
	}

}
