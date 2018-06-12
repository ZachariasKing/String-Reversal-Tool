import java.util.Scanner;

/**
 * 'ReversalTool' represents the tool which reverses words given to it by the user.
 * 
 * @author Zacharias King
 * @version v0.1
 */
public class ReversalTool {
	
	/**
	 * 
	 * This method provides the user with some guidance, asking them to enter the word they want to reverse
	 * 
	 * @return the word provided by the user
	 */
	public String retrieveInput()
	{
		System.out.print("Hello, please enter the string you would like to reverse: ");
		Scanner input = new Scanner(System.in);
		return input.nextLine();
	}
	
	/**
	 * This method does the ultimate job of actually reversing any words passed to it as an argument.
	 * @param originalWord this is the word we want to reverse
	 * @return the reversed version of the 'orginalWord' 
	 */
	public String reverse(String originalWord) {
		
		String reversedWord = "";
		
		for(int i = originalWord.length() - 1; i >= 0; i--)
		{
			reversedWord += originalWord.toLowerCase().charAt(i);
			//System.out.print(originalWord.charAt(i));
		}
		
		return reversedWord;
	}

}
