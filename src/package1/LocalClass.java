package package1;

import java.util.ArrayList;
import java.util.List;

public class LocalClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

	}
	
	public void addLatinName()
	{
		class Decorator
		{
			private Integer balloon;
			private String cake;
			
			
			public Decorator(Integer balloon, String cake) {
				this.balloon = balloon;
				this.cake = cake;
			}


			@Override
			public String toString() {
				return balloon.toString();
			}
			
			
		}
		
		List<Decorator> decorators = new ArrayList<>();
		for(var items: decorators)
		{
			
		}
	}

}
