import java.util.ArrayList;
import java.util.Scanner;

public class TailNumber{
	public static void main(String [] args){
		//Base values
		String tailNumber = "";
		
		Scanner in = new Scanner(System.in);
		
		System.out.printf("Please enter the tail number of your aircraft: ");
		tailNumber = in.nextLine();
		
		System.out.printf("You have put %s as your Tail Number.\n", tailNumber);
		
	/**Convert the tailNumber to a Char array**/
		
		//Creates a char array that is variable for the tail number entered
		ArrayList<Character> charTailNumber = new ArrayList();
		
		for(int i = 0; i < tailNumber.length(); i++){
			charTailNumber.add(tailNumber.charAt(i));
		}
		
		for(int i = 0; i < charTailNumber.size(); i++){
			System.out.printf("'%c',",charTailNumber.get(i));
		}
		System.out.println(); //Used for creating a space
	}
}