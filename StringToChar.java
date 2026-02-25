package week3.day1;

public class StringToChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//Input = Test Leaf; output = faeL tseT
	 
		//covert the given string to character
		//for loop(conditions and iteration)
		//print the output
		
		String companyName = "Test Leaf";
		
		char[] CharArray=companyName.toCharArray();
		for (int i=CharArray.length-1;i>=0;i--) {
		System.out.println(CharArray[i]);

	}
		
}
}