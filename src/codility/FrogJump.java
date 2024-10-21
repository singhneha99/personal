package codility;

public class FrogJump {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solution(10,85,30);
	}
	
	public static int solution(int X, int Y, int D) 
	{
		int count = 0;
		while(X < Y)
		{
			X = X + D;
			count++;
		}
		System.out.println(count);
		return count;
    }

}
