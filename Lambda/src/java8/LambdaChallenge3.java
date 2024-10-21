package java8;

import java.util.function.Supplier;

public class LambdaChallenge3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Supplier<String> iLoveJava = ()-> "I love Java!";
		System.out.println(iLoveJava.get());
	}
}
