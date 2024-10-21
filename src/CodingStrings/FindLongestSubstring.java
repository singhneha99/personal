package CodingStrings;

public class FindLongestSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String arr[] = {"geeksforgeeks", "geks", "geek", "geezer"};
		
		String longestCommon = "";
		
		 if (arr == null || arr.length == 0) 
		 {
			 longestCommon = "-1"; // No common prefix
	     }
        String prefix = arr[0];

        for (int i = 1; i < arr.length; i++) 
        {
            
            while (arr[i].indexOf(prefix) != 0) 
            {
                prefix = prefix.substring(0, prefix.length() - 1);
                longestCommon = prefix;
                
                if (prefix.isEmpty()) 
                {
                	longestCommon = "-1";
                }
            }
        }
        
        System.out.println(longestCommon);

	}

}
