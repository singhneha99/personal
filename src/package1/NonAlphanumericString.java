package package1;

public class NonAlphanumericString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "singhneha10063@gmail.com";
		String nonAlphaString = "";
		
		for(int i = 0; i<=str.length()-1; i++)
		{
			char ch = str.charAt(i);
			int ascii = (int)ch;
			if((ascii>=65 && ascii<=90)||(ascii>=97 && ascii<=122)||(ascii>=48 && ascii<=57))
			{
				nonAlphaString+=ch;
			}
		}
		System.out.println(nonAlphaString);

	}

}
